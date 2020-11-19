package com.applicationexceptions;

public class InvalidAgeRangeException extends Exception{
	
	private String errorMessage;

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	public InvalidAgeRangeException(String errorMessage)
	{
		this.errorMessage=errorMessage;
	}
}
