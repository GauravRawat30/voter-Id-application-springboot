package com.application.voterid.controller;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.application.voterid.entity.State;
import com.application.voterid.entity.loginDetail;
import com.application.voterid.service.userService;

@Controller
public class myController {

	@Autowired
	userService service;

	//get all states
	@GetMapping("/form")
	public String form(Model model, HttpSession session) {

		model.addAttribute("userData", new loginDetail());
		session.removeAttribute("msg");

		model.addAttribute("state", service.state());

		return "userform";
	}

	//send input data
	@PostMapping("/process")
	public String Detail(@Valid @ModelAttribute("userData") loginDetail logindetail, BindingResult result,
			HttpSession session, Model model) {

		if (result.hasErrors()) {
			System.out.println(result);
			model.addAttribute("state", service.state());
			return "userform";
		}
		
		service.user(logindetail);
		int age = service.getAge();
		service.saveAge(service.getAge());


		model.addAttribute("age", age);

		return "redirect:/list";

	}

	//get list as per state name
	@GetMapping("/list")
	public String userlist(Model model, @RequestParam(value = "state", required = false) String state) {

		String name = "Select State";

		if (state == null || state == name) {
			List<loginDetail> user = service.allusers();

			model.addAttribute("user", user);

		}

		if (state != null) {
			List<loginDetail> userr = service.findState(state);
			model.addAttribute("user", userr);
		}
		model.addAttribute("state", service.state());

		return "userlist";
	}

}
