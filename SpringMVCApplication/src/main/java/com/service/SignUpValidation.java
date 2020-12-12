package com.service;

import com.appexception.ApplicationException;
import com.model.SignUp;

public interface SignUpValidation {

	public void validateSignUpPage(SignUp signUp) throws ApplicationException;
	public boolean isPasswordNotStrong(String password) throws ApplicationException;
}
