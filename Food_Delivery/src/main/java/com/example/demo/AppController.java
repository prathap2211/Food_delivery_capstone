package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {

	@Autowired
	private UserRepository repo;
	
	@GetMapping("/index")
	public String viewHomepage() {
		return "index";
	}
	
	@GetMapping("/signup")
	public String showSignUpForm(Model model) {
		model.addAttribute("user", new User());
		
		return "signup";
	}
	
	@PostMapping("/process_register")
	public String processRegistration(User user) {
		repo.save(user);
		
		return "success";
	}
	
	@GetMapping("/adminsignup")
	public String showSignUpForm1(Model model) {
		model.addAttribute("user", new User());
		
		return "adminsignup";
	}
	
	
	
	@RequestMapping("/login")
	public String defectDetails() {
	    return "login";
	}
	    
	@RequestMapping("/adminlogin")
	public String defectDetails1() {
	    return "adminlogin";
	}
	
	@RequestMapping("/aboutus")
	public String defectDetails2() {
	    return "aboutus";
	}
	
	@RequestMapping("/order")
	public String defectDetails3() {
	    return "order";
	}
	
	@RequestMapping("/payment")
	public String defectDetails4() {
	    return "payment";
	}
	
}
