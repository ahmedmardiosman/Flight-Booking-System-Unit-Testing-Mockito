package com.qa.buisiness.service;

import javax.inject.Inject;

import com.qa.persistence.repository.FlightRepository;

public class FlightServiceImpl implements FlightService {

	@Inject
	private FlightRepository repo;

	public String getAllUserAndFlightInformation() {
		return repo.getAllUserAndFlightInformation();
	}

	public String getAllUserInformation() {
		return repo.getAllUserInformation();
	}

	public String getAllFlightsInformation() {
		return repo.getAllFlightsInformation();
	}

	public String getUser(Long customerId) {
		return repo.getUser(customerId);
	}

	public String getFlight(Long flightId) {
		return repo.getFlight(flightId);
	}

	public String createUser(String user) {
		return repo.createUser(user);
	}

	public String createFlight(String flight) {
		return repo.createFlight(flight);
	}

	public String updateUser(Long customerId, String updatedUser) {
		return repo.updateUser(customerId, updatedUser);
	}

	public String updateFlight(Long flightId, String updatedFlight) {
		return repo.updateFlight(flightId, updatedFlight);
	}

	public String deleteUser(Long customerId) {
		return repo.deleteUser(customerId);
	}

	public String deleteFlight(Long flightId) {
		return repo.deleteFlight(flightId);
	}

	// flight destinations

	public String getAllFlightDestinations() {
		return repo.getAllFlightDestinations();
	}

	public String getFlightDestination(Long destinationId) {
		return repo.getFlightDestination(destinationId);
	}

	public String createFlightDestination(String flightDestination) {
		return repo.createFlightDestination(flightDestination);

	}

	public String updateFlightDestination(Long destinationId, String updatedFlightDestination) {
		return repo.updateFlightDestination(destinationId, updatedFlightDestination);
	}

	public String deleteFlightDestination(Long destinationId) {
		return repo.deleteFlightDestination(destinationId);
	}

	public String getAdminAccount(Long adminId) {
		return repo.getAdminAccount(adminId);
	}

}