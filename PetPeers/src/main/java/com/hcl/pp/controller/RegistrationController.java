package com.hcl.pp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hcl.pp.model.User;

@Controller
public class RegistrationController {
	
	@RequestMapping(value="one")
	public String addUserFront(Model model)
	{
		System.out.println("hello world");
		model.addAttribute("userDetails",new User());
		return "userregn";
	}
	
	@PostMapping(value="add")
	public String addUser(@ModelAttribute("userDetails") User user,Model model)
	{
		return "userregn";
	}

}
