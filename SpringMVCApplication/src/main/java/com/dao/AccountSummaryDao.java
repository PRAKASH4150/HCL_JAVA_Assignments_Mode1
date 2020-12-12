package com.dao;

import com.model.SignUp;

public interface AccountSummaryDao {

	public SignUp getAccountSummary(int cust_id);
		
}
