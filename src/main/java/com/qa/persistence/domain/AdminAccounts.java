package com.qa.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AdminAccounts {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long adminId;
	private String adminName;
	private String password;

	public AdminAccounts() {
	}

	public AdminAccounts(String adminName, String password) {

		this.setAdminName(adminName);
		this.setPassword(password);

	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	

}