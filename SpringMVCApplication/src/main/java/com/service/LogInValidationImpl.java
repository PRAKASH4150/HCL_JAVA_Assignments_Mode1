package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appexception.ApplicationException;
import com.dao.LogInDao;
import com.model.LogIn;

@Service
public class LogInValidationImpl implements LogInValidation {

	@Autowired
	private LogInDao logInDaoImpl;
	
	public int doesUserExists(LogIn logIn) {
		
		return(logInDaoImpl.doesUserExists(logIn));
	}

	public int checkUserCredentials(LogIn logIn) throws ApplicationException {
		
		return(logInDaoImpl.checkUserCredentials(logIn));
	}

}
