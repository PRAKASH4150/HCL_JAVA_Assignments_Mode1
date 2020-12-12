package com.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.appexception.ApplicationException;
import com.model.SignUp;
import com.service.SignUpValidation;


@Controller
public class SignUpController {
	
	@Autowired
	private SignUpValidation signUpValidationImpl;
	
	@RequestMapping(value="signup")
	public String signUpFront(Model model)
	{
		model.addAttribute("accDetails",new SignUp());
		return "signup";
	}
	
	@PostMapping(value="sign-up")
	public String signUpProcessing(@ModelAttribute("accDetails") SignUp signUp,Model model)
	{   
		System.out.println(signUp.getPassword());
		System.out.println(signUp.getConfirmPassword());
		
		try {
			signUpValidationImpl.validateSignUpPage(signUp);
			return "redirect:/login";
		    } catch (ApplicationException e) {
			model.addAttribute("error",e.getMessage());
	        return "signup";
		}
		
	}
	
	
}
