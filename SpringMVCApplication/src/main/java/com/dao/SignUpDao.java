package com.dao;

import com.model.SignUp;

public interface SignUpDao {

	public void createAccount(SignUp signUp);
	public boolean doesAccountExists(SignUp signUp);
}
