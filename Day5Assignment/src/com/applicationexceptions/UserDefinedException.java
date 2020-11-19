package com.applicationexceptions;

public class UserDefinedException extends Exception {

	private String errorMessage;

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	public UserDefinedException(String errorMessage)
	{
		this.errorMessage=errorMessage;
	}
}
