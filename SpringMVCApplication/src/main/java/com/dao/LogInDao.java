package com.dao;

import com.appexception.ApplicationException;
import com.model.LogIn;

public interface LogInDao {
	public int doesUserExists(LogIn logIn);
	public int checkUserCredentials(LogIn logIn) throws ApplicationException;
}
