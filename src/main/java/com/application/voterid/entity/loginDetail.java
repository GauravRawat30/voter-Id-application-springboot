package com.application.voterid.entity;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import Beanvalidator.Validator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class loginDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@NotBlank(message = "First Name cannot be blank")
	@Size(min = 3, max = 12)
	String firstName;

	@NotBlank(message = "Last Name cannot be blank")
	@Size(min = 3, max = 12)
	String lastName;

	@Validator(message="Age must be above 18 years")
	String dob;

	@NotBlank(message = "City cannot be blank")
	String city;

	@NotBlank(message = "Nationality cannot be blank")
	String nationality;

	String state;

	@NotNull
	int age;

	@NotBlank(message = "Pin Code cannot be blank")
	@Size(min = 6, max = 6,message = "size must be of 6 digits")
	String pinCode;

	public loginDetail(int id,
			@NotBlank(message = "First Name cannot be blank") @Size(min = 3, max = 12) String firstName,
			@NotBlank(message = "Last Name cannot be blank") @Size(min = 3, max = 12) String lastName, String dob,
			String city, @NotBlank(message = "Nationality cannot be blank") String nationality, @NotNull int age,
			@NotBlank(message = "Pin Code cannot be blank") String pinCode,String state) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.city = city;
		this.nationality = nationality;
		this.age = age;
		this.pinCode = pinCode;
		this.state = state;

	}
	

	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public loginDetail() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}


	@Override
	public String toString() {
		return "loginDetail [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob
				+ ", city=" + city + ", nationality=" + nationality + ", state=" + state + ", age=" + age + ", pinCode="
				+ pinCode + "]";
	}


}
