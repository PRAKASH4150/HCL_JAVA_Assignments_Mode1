package com.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.AccountSummaryDao;
import com.model.SignUp;

@Service("accountSummaryImpl")
public class AccountSummaryImpl implements AccountSummary{
	
	@Autowired
	private AccountSummaryDao accountSummaryDaoImpl;

	public SignUp getAccountSummary(int cust_id) {
	   
		return(accountSummaryDaoImpl.getAccountSummary(cust_id));
	}

}
