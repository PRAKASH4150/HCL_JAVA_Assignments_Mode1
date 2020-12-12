package com.service;

import com.appexception.ApplicationException;
import com.model.LogIn;

public interface LogInValidation {

	public int doesUserExists(LogIn logIn);
	
	public int checkUserCredentials(LogIn logIn) throws ApplicationException;
}
