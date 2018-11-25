package com.qa.persistence.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	@Column(name = "customer_id")
	private Long customerId;

	private String userName;

	private String firstName;

	private String secondName;

	private String adressLine1;

	private String adressLine2;

	private String townOrCity;

	private String postcode;

	private String telephoneNumber;

	private String email;

	private String password;

	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "customer_id", referencedColumnName = "customer_id")
	private List<FlightDetails> flightdetailsList;

	public Users() {

	}

	public Users( String userName, String firstName, String secondName, String adressLine1,
			String adressLine2, String townOrCity, String postcode, String telephoneNumber, String email,
			String password) {
	
		this.setUserName(userName);
		this.setFirstName(firstName);
		this.setSecondName(secondName);
		this.setAdressLine1(adressLine1);
		this.setAdressLine2(adressLine2);
		this.setTownOrCity(townOrCity);
		this.setPostcode(postcode);
		this.setTelephoneNumber(telephoneNumber);
		this.setEmail(email);
		this.setPassword(password);
	}

	

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getAdressLine1() {
		return adressLine1;
	}

	public void setAdressLine1(String adressLine1) {
		this.adressLine1 = adressLine1;
	}

	public String getAdressLine2() {
		return adressLine2;
	}

	public void setAdressLine2(String adressLine2) {
		this.adressLine2 = adressLine2;
	}

	public String getTownOrCity() {
		return townOrCity;
	}

	public void setTownOrCity(String townOrCity) {
		this.townOrCity = townOrCity;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<FlightDetails> getFlightDetails() {
		return flightdetailsList;
	}

	public void setFlightDetails(List<FlightDetails> FlightDetails) {
		this.flightdetailsList = FlightDetails;
	}
	
	private Long getCustomerId() {
		return customerId;
	}

	private void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

}
