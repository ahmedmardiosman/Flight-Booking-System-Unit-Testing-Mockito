package com.qa.persistence.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FlightDetails {

	@Id

	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long flightId;

	@Column(name = "customer_id")
	private Long customerId;

	private String destinationCountry;

	private String destinationCity;

	private String priceOfFlight;

	private String cardNumber;

	private String expiryDate;

	private String cvv;

	public FlightDetails(String destinationCountry, String destinationCity, String priceOfFlight, String cardNumber,
			String expiryDate, String cvv) {
		this.setDestinationCountry(destinationCountry);
		this.setDestinationCity(destinationCity);
		this.setPriceOfFlight(priceOfFlight);
		this.setCardNumber(cardNumber);
		this.setExpiryDate(expiryDate);
		this.setCvv(cvv);
	}

	public FlightDetails() {

	}

	public String getDestinationCountry() {
		return destinationCountry;
	}

	public void setDestinationCountry(String destinationCountry) {
		this.destinationCountry = destinationCountry;
	}

	public String getDestinationCity() {
		return destinationCity;
	}

	public void setDestinationCity(String destinationCity) {
		this.destinationCity = destinationCity;
	}

	public String getPriceOfFlight() {
		return priceOfFlight;
	}

	public void setPriceOfFlight(String priceOfFlight) {
		this.priceOfFlight = priceOfFlight;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
	
	private Long getCustomerId() {
		return customerId;
	}

	private void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

}
