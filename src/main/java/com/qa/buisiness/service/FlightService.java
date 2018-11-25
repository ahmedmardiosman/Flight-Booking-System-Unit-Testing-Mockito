package com.qa.buisiness.service;

public interface FlightService {

	String getAllUserAndFlightInformation();

	String getAllUserInformation();

	String getAllFlightsInformation();

	String getUser(Long customerId);

	String getFlight(Long flightId);

	String createUser(String user);

	String createFlight(String flight);

	String updateUser(Long customerId, String updatedUser);

	String updateFlight(Long flightId, String updatedFlight);

	String deleteUser(Long customerId);

	String deleteFlight(Long flightId);

	// flight destinations

	String getAllFlightDestinations();

	String getFlightDestination(Long destinationId);

	String createFlightDestination(String flightDestination);

	String updateFlightDestination(Long destinationId, String updatedFlightDestination);

	String deleteFlightDestination(Long destinationId);
	
	//Admin Accounts DB
	
	String getAdminAccount(Long adminId);
}