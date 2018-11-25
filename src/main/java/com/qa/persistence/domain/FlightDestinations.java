package com.qa.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FlightDestinations {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long destinationId;
	private String destCountry;
	private String destCity;
	private String destDistance;
	private String destPrice;

	public FlightDestinations() {
	}

	public FlightDestinations(String destCountry, String destCity, String destDistance, String destPrice) {

		this.setDestCountry(destCountry);
		this.setDestCity(destCity);
		this.setDestDistance(destDistance);
		this.setDestPrice(destPrice);

	}

	public String getDestCountry() {
		return destCountry;
	}

	public void setDestCountry(String destCountry) {
		this.destCountry = destCountry;
	}

	public String getDestCity() {
		return destCity;
	}

	public void setDestCity(String destCity) {
		this.destCity = destCity;
	}

	public String getDestDistance() {
		return destDistance;
	}

	public void setDestDistance(String destDistance) {
		this.destDistance = destDistance;
	}

	public String getDestPrice() {
		return destPrice;
	}

	public void setDestPrice(String destPrice) {
		this.destPrice = destPrice;
	}
	
	private Long getDestinationId() {
		return destinationId;
	}

	private void setDestinationId(Long destinationId) {
		this.destinationId = destinationId;
	}

}