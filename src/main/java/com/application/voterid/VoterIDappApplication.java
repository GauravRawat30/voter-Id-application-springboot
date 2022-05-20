package com.application.voterid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.application.voterid.entity.loginDetail;
import com.application.voterid.repository.userRepository;
import com.application.voterid.service.userService;


@SpringBootApplication
public class VoterIDappApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(VoterIDappApplication.class, args);
	
		
	}

}
