package com.qa.FlightDBRepositoryTest;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.qa.persistence.domain.Users;
import com.qa.persistence.repository.FlightDBRepository;
import com.qa.util.JSONUtil;

@RunWith(MockitoJUnitRunner.class)
public class FlightDBRepositoryTest {

	@InjectMocks
	private FlightDBRepository repo;

	@Mock
	private EntityManager manager;

	@Mock
	private Query query;

	private JSONUtil util;

	private static final String MOCK_DATA_ARRAY = "[{\"userName\":\"ahmedosman\",\"firstName\":\"Ahmed\",\"secondName\":\"Osman\",\"adressLine1\":\"3 Northampton Road\",\"adressLine2\":\"\",\"townOrCity\":\"Northampton\",\"postcode\":\"NN4 5DH\",\"telephoneNumber\":\"07542563587\",\"email\":\"ahmedo@outlook.com\",\"password\":\"ahmedosman\"}]";

	private static final String MOCK_OBJECT = "[{\"userName\":\"ahmedosman\",\"firstName\":\"Ahmed\",\"secondName\":\"Osman\",\"adressLine1\":\"3 Northampton Road\",\"adressLine2\":\"\",\"townOrCity\":\"Northampton\",\"postcode\":\"NN4 5DH\",\"telephoneNumber\":\"07542563587\",\"email\":\"ahmedo@outlook.com\",\"password\":\"ahmedosman\"}]";

	@Before
	public void setup() {
		repo.setManager(manager);
		util = new JSONUtil();
		repo.setUtil(util);
	}

	@Test
	public void testGetAllUsers() {
		Mockito.when(manager.createQuery(Mockito.anyString())).thenReturn(query);
		List<Users> User = new ArrayList<Users>();
		User.add(new Users("ahmedosman", "Ahmed", "Osman", "3 Northampton Road", "", "Northampton", "NN4 5DH", "07542563587", "ahmedo@outlook.com", "ahmedosman"));
		Mockito.when(query.getResultList()).thenReturn(User);
		Assert.assertEquals(MOCK_DATA_ARRAY, repo.getAllUserInformation());
	}

	@Test
	public void testCreateFlight() {
		String reply = repo.createFlight(MOCK_OBJECT);
		Assert.assertEquals(reply, "{\"message\": \"A flight has been sucessfully created\"}");
	}

	@Test
	public void testDeleteFlight() {
		String reply = repo.deleteFlight(1L);
		Assert.assertEquals(reply, "{\"message\": \"Flight was sucessfully deleted\"}");
	}

}
