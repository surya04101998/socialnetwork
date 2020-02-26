package com.model;

import org.springframework.stereotype.Component;

@Component
public class Details {

	private String name;
	
	private String emailid;
	private String password;
	
	private String signinAs;
	
	public String getSigninAs() {
		return signinAs;
	}
	public void setSigninAs(String signinAs) {
		this.signinAs = signinAs;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
