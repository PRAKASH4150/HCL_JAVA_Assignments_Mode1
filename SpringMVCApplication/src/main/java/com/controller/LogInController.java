package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.appexception.ApplicationException;
import com.model.LogIn;
import com.service.LogInValidation;

@Controller
//@SessionAttributes("cust_id")
public class LogInController {

	@Autowired
	private LogInValidation logInValidationImpl;
	
	@RequestMapping(value="login")
	public String logInFront(Model model)
	{
	  model.addAttribute("loginDetails",new LogIn());
	  return "login";
	}
	
	@PostMapping(value="log-in")
	public String logInProcess(@ModelAttribute("loginDetails") LogIn logIn,Model model)
	{
		int cust_count=logInValidationImpl.doesUserExists(logIn);
		Integer cust_id=0;
		if(cust_count==0)
		{
			model.addAttribute("error","User not exists. Please sign-in first");
			return "login";
		}
		else
		{
			try {  
				cust_id=logInValidationImpl.checkUserCredentials(logIn);
		        //model.addAttribute("cust_id",cust_id);
			    return "redirect:/home/"+cust_id;
			    } 
			catch (ApplicationException e) {
				
				model.addAttribute("error",e.getMessage());
				return "login";
			}
			
		}
	}
}
