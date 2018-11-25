package com.qa.persistence.repository;

import javax.ws.rs.PathParam;

public interface FlightRepository {

	String getAllUserAndFlightInformation();

	String getAllUserInformation();

	String getAllFlightsInformation();

	String getUser(Long customerId);

	String getFlight(Long flightId);

	String createUser(String user);

	String createFlight(String flight);

	String updateUser(Long customerId, String updatedUser);

	String updateFlight(Long flightId, String updatedflight);

	String deleteUser(Long customerId);

	String deleteFlight(Long flightId);

	// flight destinations

	String getAllFlightDestinations();

	String getFlightDestination(Long destinationId);

	String createFlightDestination(String flightDestination);

	String updateFlightDestination(Long destinationId, String updatedFlightDestination);

	String deleteFlightDestination(Long destinationId);

	// Admin Account DB

	String getAdminAccount(Long adminId);
}