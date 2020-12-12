package com.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.SignUp;
import com.service.AccountSummary;

@Controller
public class HomePageController {

	@Autowired
	private AccountSummary accountSummaryImpl;
	
	@RequestMapping("home/{cust_id}")
	public String accountSummary(@PathVariable("cust_id") int cust_id,Model model)
	{
		//Integer cust_id=(Integer)model.getAttribute("cust_id");
		System.out.println("Cust_id Home:"+cust_id);
		SignUp signUp=accountSummaryImpl.getAccountSummary(cust_id);
		model.addAttribute("accountSummary",signUp);
		
		return "homepage";
	}
}
