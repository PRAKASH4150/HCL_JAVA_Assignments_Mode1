package com.model;
public class SignUp {

	private long userId;
	private String userName;
	private String password;
	private String confirmPassword;
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public SignUp(long userId, String userName, String password, String confirmPassword) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.confirmPassword = confirmPassword;
	}
	public SignUp() {
		super();
	}
	
}
