package week8.api.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import week8.app.controller.UserManager;
import week8.app.dao.UserDAO;
import week8.app.exception.NametooShortException;
import week8.app.model.User;
import week8.app.service.UserService;

public class Test {

	private static final int ORDER_ID = 123;
	@Mock
	UserDAO userDAO;
	UserService userservice;
	
	private User user;
	private UserManager manager;
	private UserService service;
	

	@Before
	public void setup() throws NametooShortException {
		MockitoAnnotations.initMocks(this);

	}

	@Test
	public void Add_user_to_manager_should_add_user() {

		when(service.Insertuser(user)).thenReturn(true);
		boolean result = ser
				assertTrue(result);



	}




}
