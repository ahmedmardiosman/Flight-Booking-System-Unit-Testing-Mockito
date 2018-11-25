package com.qa.EndpointTesting;
import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.qa.buisiness.service.FlightService;
import com.qa.rest.FlightEndpoints;


@RunWith(MockitoJUnitRunner.class)
public class FBSEndpointTest {

	private static final String MOCK_VALUE2 = "test_value_2";

	private static final String MOCK_VALUE = "test_value";

	@InjectMocks
	private FlightEndpoints endpoint;

	@Mock
	private FlightService service;

	@Before
	public void setup() {
		endpoint.setService(service);
	}

	@Test
	public void testGetAllAccounts() {
		Mockito.when(service.getAllUserAndFlightInformation()).thenReturn(MOCK_VALUE);
		Assert.assertEquals(MOCK_VALUE, endpoint.getAllUserAndFlightInformation());
	}

	@Test
	public void testCreateFlight() {
		Mockito.when(service.createFlight(MOCK_VALUE2)).thenReturn(MOCK_VALUE);
		Assert.assertEquals(MOCK_VALUE, endpoint.createFlight(MOCK_VALUE2));
		Mockito.verify(service).createFlight(MOCK_VALUE2);
	}

	@Test
	public void testDeleteUser() {
		Mockito.when(service.deleteUser(1L)).thenReturn(MOCK_VALUE);
		Assert.assertEquals(MOCK_VALUE, endpoint.deleteUser(1L));
		Mockito.verify(service).deleteUser(1L);
	}

}
