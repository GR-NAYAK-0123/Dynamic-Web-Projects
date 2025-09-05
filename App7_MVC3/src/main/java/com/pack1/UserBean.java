package com.pack1;

import java.io.Serializable;

public class UserBean implements Serializable{
	
	private String userName;
	private String password;
	private String firstName;
	private String LstName;
	private String MailId;
	private String Phone;
	
	public UserBean() {}
	
	
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
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLstName() {
		return LstName;
	}
	public void setLastName(String lstName) {
		LstName = lstName;
	}
	public String getMailId() {
		return MailId;
	}
	public void setMailId(String mailId) {
		MailId = mailId;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	
	
}
