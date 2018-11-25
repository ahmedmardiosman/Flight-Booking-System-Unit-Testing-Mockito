package com.qa.rest;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.qa.buisiness.service.FlightService;

@Path("/QAFBS")
public class FlightEndpoints {

	@Inject
	private FlightService service;

//User and Flight Endpoints
	@Path("/getAllUserAndFlightInformation")
	@GET
	@Produces({ "application/json" })
	public String getAllUserAndFlightInformation() {
		return service.getAllUserAndFlightInformation();
	}

	// Dont even need these because I can just specify using the axios get request
	// what bits of information I want from the database
	@Path("/getAllUserInformation")
	@GET
	@Produces({ "application/json" })
	public String getAllUserInformation() {
		return service.getAllUserInformation();
	}

	@Path("/getAllFlightsInformation")
	@GET
	@Produces({ "application/json" })
	public String getAllFlightsInformation() {
		return service.getAllFlightsInformation();
	}

	@Path("/getUser/{id}")
	@GET
	@Produces({ "application/json" })
	public String getUser(@PathParam("id") Long customerId) {
		return service.getUser(customerId);
	}

	@Path("/getFlight/{id}")
	@GET
	@Produces({ "application/json" })
	public String getFlight(@PathParam("id") Long flightId) {
		return service.getFlight(flightId);
	}

	@Path("/createUser")
	@POST
	@Produces({ "application/json" })
	public String createUser(String user) {
		return service.createUser(user);
	}

// code to post new user
//    {
//        
//        "userName": "ahmedosman",
//        "firstName": "Ahmed",
//        "secondName": "Osman",
//        "adressLine1": "3 Northampton Road",
//        "adressLine2": "",
//        "townOrCity": "Northampton",
//        "postcode": "NN4 5DH",
//        "telephoneNumber": "07542563587",
//        "email": "ahmedo@outlook.com",
//        "password": "ahmedosman"
//        }

	@Path("/createFlight")
	@POST
	@Produces({ "application/json" })
	public String createFlight(String flight) {
		return service.createFlight(flight);
	}

//	code to add flight
//	{
//        
//        "customerId": 1,
//        "destinationCountry": "Egypt",
//        "destinationCity": "Cairo",
//        "priceOfFlight": "3421",
//        "cardNumber": "9856452145328756",
//        "expiryDate": "08/2019",
//        "cvv": "454"
//    }

	@Path("/updateUser/{id}")
	@PUT
	@Produces({ "application/json" })
	public String updateUser(@PathParam("id") Long customerId, String updatedUser) {
		return service.updateUser(customerId, updatedUser);
	}

	// to update user

//	{
//        "userName": "ahmedosman",
//        "firstName": "Ahmed",
//        "secondName": "Osman",
//        "adressLine1": "3 Northampton Road",
//        "adressLine2": "",
//        "townOrCity": "Northampton",
//        "postcode": "NN4 5DH",
//        "telephoneNumber": "07542563587",
//        "email": "ahmedo@outlook.com",
//        "password": "ahmedosman"
//			}

	@Path("/updateFlight/{id}")
	@PUT
	@Produces({ "application/json" })
	public String updateFlight(@PathParam("id") Long flightId, String updatedFlight) {
		return service.updateFlight(flightId, updatedFlight);
	}

//            {
//                "flightId": 1,
//                "customerId": 1,
//                "destinationCountry": "Egypt",
//                "destinationCity": "Cairo",
//                "priceOfFlight": "3421",
//                "cardNumber": "9856452145328756",
//                "expiryDate": "08/2019",
//                "cvv": "454"
//           }

	@Path("/deleteUser/{id}")
	@DELETE
	@Produces({ "application/json" })
	public String deleteUser(@PathParam("id") Long customerId) {
		return service.deleteUser(customerId);
	}

	@Path("/deleteFlight/{id}")
	@DELETE
	@Produces({ "application/json" })
	public String deleteFlight(@PathParam("id") Long flightId) {
		return service.deleteFlight(flightId);
	}

	// FlightDestinations Endpoints

	@Path("/getAllFlightDestinations")
	@GET
	@Produces({ "application/json" })
	public String getAllFlightDestinations() {
		return service.getAllFlightDestinations();
	}

	@Path("/getFlightDestination/{id}")
	@GET
	@Produces({ "application/json" })
	public String getFlightDestination(@PathParam("id") Long destinationId) {
		return service.getFlightDestination(destinationId);
	}

	@Path("/createFlightDestination")
	@POST
	@Produces({ "application/json" })
	public String createFlightDestination(String flightDestination) {
		return service.createFlightDestination(flightDestination);
	}

//	{
//		  "destCountry": "Somalia2",
//		  "destCity": "Berlsdfasfin",
//		  "destDistance": "93sdafasdfa2",
//		  "destPrice": "10dfasswag0"
//		}
	
	//this is not working??
	@Path("/updateFlightDestination/{id}")
	@PUT
	@Produces({ "application/json" })
	public String updateFlightDestination(@PathParam("id") Long destinationId, String updatedFlightDestination) {
		return service.updateFlightDestination(destinationId, updatedFlightDestination);
	}

	@Path("/deleteFlightDestination/{id}")
	@DELETE
	@Produces({ "application/json" })
	public String deleteFlightDestination(@PathParam("id") Long destinationId) {
		return service.deleteFlightDestination(destinationId);
	}
	
	//get Admin Account Details for login
	
	@Path("/getAdminAccount/{id}")
	@GET
	@Produces({ "application/json" })
	public String getAdminAccount(@PathParam("id") Long adminId) {
		return service.getAdminAccount(adminId);
	}
	
	public void setService(FlightService service) {
		this.service = service;
	}
	

}
