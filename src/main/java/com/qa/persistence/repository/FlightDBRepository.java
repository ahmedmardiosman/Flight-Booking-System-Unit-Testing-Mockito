package com.qa.persistence.repository;

import static javax.transaction.Transactional.TxType.SUPPORTS;
import static javax.transaction.Transactional.TxType.REQUIRED;

import java.util.Collection;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import com.qa.persistence.domain.AdminAccounts;
import com.qa.persistence.domain.FlightDestinations;
import com.qa.persistence.domain.FlightDetails;
import com.qa.persistence.domain.Users;
import com.qa.util.JSONUtil;

// Class to add stuff to database

@Transactional(SUPPORTS)
@Default
@ApplicationScoped
public class FlightDBRepository implements FlightRepository {

	@PersistenceContext(unitName = "primary")
	private EntityManager manager;

	public void setManager(EntityManager manager) {
		this.manager = manager;
	}

	@Inject
	private JSONUtil jsonConverter;

	public String getAllUserAndFlightInformation() {
		Query query1 = manager.createQuery("SELECT a FROM Users a");
		Collection<Users> usersAndFlights = (Collection<Users>) query1.getResultList();
		return jsonConverter.getJSONForObject(usersAndFlights);
	}

	public String getAllUserInformation() {
		Query query2 = manager.createQuery("SELECT a FROM Users a");

		Collection<Users> Users = (Collection<Users>) query2.getResultList();

		return jsonConverter.getJSONForObject(Users);
	}

	public String getAllFlightsInformation() {
		Query query3 = manager.createQuery("SELECT a FROM FlightDetails a");

		Collection<FlightDetails> flights = (Collection<FlightDetails>) query3.getResultList();
		return jsonConverter.getJSONForObject(flights);
	}

	@Transactional(REQUIRED)
	public String getUser(Long customerId) {
		Users aUser = findUser(customerId);

		return jsonConverter.getJSONForObject(aUser);
	}

	@Transactional(REQUIRED)
	public String getFlight(Long flightId) {
		FlightDetails aFlight = findFlight(flightId);

		return jsonConverter.getJSONForObject(aFlight);
	}

	@Transactional(REQUIRED)
	public String createUser(String user) {
		Users aUser = jsonConverter.getObjectForJSON(user, Users.class);
		manager.persist(aUser);
		return "{\"message\": \"A user has been sucessfully created\"}";
	}

	@Transactional(REQUIRED)
	public String createFlight(String flight) {
		FlightDetails aFlight = jsonConverter.getObjectForJSON(flight, FlightDetails.class);
		manager.persist(aFlight);
		return "{\"message\": \"A flight has been sucessfully created\"}";
	}

	@Transactional(REQUIRED)
	public String updateUser(Long customerId, String updateUser) {
		Users aUser = jsonConverter.getObjectForJSON(updateUser, Users.class);
		Users userInDB = findUser(customerId);
		if (userInDB != null) {
			userInDB.setUserName(aUser.getUserName());
			userInDB.setFirstName(aUser.getFirstName());
			userInDB.setSecondName(aUser.getSecondName());
			userInDB.setAdressLine1(aUser.getAdressLine1());
			userInDB.setAdressLine2(aUser.getAdressLine2());
			userInDB.setTownOrCity(aUser.getTownOrCity());
			userInDB.setPostcode(aUser.getPostcode());
			userInDB.setTelephoneNumber(aUser.getTelephoneNumber());
			userInDB.setEmail(aUser.getEmail());
			userInDB.setPassword(aUser.getPassword());
		}
		return "{\"message\": \"User details have been sucessfully updated.\"}";
	}

	@Transactional(REQUIRED)
	public String updateFlight(Long flightId, String updateFlight) {
		FlightDetails aFlight = jsonConverter.getObjectForJSON(updateFlight, FlightDetails.class);
		FlightDetails flightInDB = findFlight(flightId);
		if (flightInDB != null) {
			flightInDB.setDestinationCountry(aFlight.getDestinationCountry());
			flightInDB.setDestinationCity(aFlight.getDestinationCity());
			flightInDB.setPriceOfFlight(aFlight.getPriceOfFlight());
			flightInDB.setCardNumber(aFlight.getCardNumber());
			flightInDB.setExpiryDate(aFlight.getExpiryDate());
			flightInDB.setCvv(aFlight.getCvv());
		}
		return "{\"message\": \"Flight details have been sucessfully updated.\"}";
	}

	@Transactional(REQUIRED)
	public String deleteUser(Long customerId) {
		Users User = findUser(customerId);
		if (User != null) {
			manager.remove(User);
		}
		return "{\"message\": \"User was sucessfully deleted\"}";
	}

	@Transactional(REQUIRED)
	public String deleteFlight(Long flightId) {
		FlightDetails flightInDB = findFlight(flightId);
		if (flightInDB != null) {
			manager.remove(flightInDB);
		}
		return "{\"message\": \"Flight was sucessfully deleted\"}";
	}

	private Users findUser(Long customerId) {
		return manager.find(Users.class, customerId);
	}

	private FlightDetails findFlight(Long flightId) {
		return manager.find(FlightDetails.class, flightId);
	}

	// flightDestinationsEntity manager to persist data

	public String getAllFlightDestinations() {
		Query query4 = manager.createQuery("SELECT a FROM FlightDestinations a");
		Collection<FlightDestinations> allFlightDestinations = (Collection<FlightDestinations>) query4.getResultList();
		return jsonConverter.getJSONForObject(allFlightDestinations);
	}

	@Transactional(REQUIRED)
	public String getFlightDestination(Long destinationId) {
		FlightDestinations aFlightDestination = findFlightDestination(destinationId);

		return jsonConverter.getJSONForObject(aFlightDestination);
	}

	@Transactional(REQUIRED)
	public String createFlightDestination(String flightDestination) {
		FlightDestinations aFlightDestination = jsonConverter.getObjectForJSON(flightDestination,
				FlightDestinations.class);
		manager.persist(aFlightDestination);
		return "{\"message\": \"A flight Destination has been sucessfully created\"}";
	}

	@Transactional(REQUIRED)
	public String updateFlightDestination(Long destinationId, String updatedFlightDestination) {
		FlightDestinations aFlightDestination = jsonConverter.getObjectForJSON(updatedFlightDestination,
				FlightDestinations.class);
		FlightDestinations flightDestinationInDB = findFlightDestination(destinationId);
		if (flightDestinationInDB != null) {

			flightDestinationInDB.setDestCountry(aFlightDestination.getDestCountry());
			flightDestinationInDB.setDestCity(aFlightDestination.getDestCity());
			flightDestinationInDB.setDestDistance(aFlightDestination.getDestDistance());
			flightDestinationInDB.setDestPrice(aFlightDestination.getDestPrice());
		}
		return "{\"message\": \"Flight Destination been sucessfully updated.\"}";
	}

	@Transactional(REQUIRED)
	public String deleteFlightDestination(Long destinationId) {
		FlightDestinations aFlightDestination = findFlightDestination(destinationId);
		if (aFlightDestination != null) {
			manager.remove(aFlightDestination);
		}
		return "{\"message\": \"A flight destination was sucessfully deleted\"}";
	}

	private FlightDestinations findFlightDestination(Long destinationId) {
		return manager.find(FlightDestinations.class, destinationId);
	}

	
	//Admin Accounts
	
	@Transactional(REQUIRED)
	public String getAdminAccount(Long flightId) {
		AdminAccounts aAdminAccount = findAdminAccount(flightId);

		return jsonConverter.getJSONForObject(aAdminAccount);
	}
	
	private AdminAccounts findAdminAccount(Long flightId) {
		return manager.find(AdminAccounts.class, flightId);
	}
	
	
	public void setUtil(JSONUtil jsonConverter) {
		this.jsonConverter = jsonConverter;
	}

}