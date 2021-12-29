package com.Linkdin;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.Linkdin.controller.LinkdinControllerInterface;
import com.Linkdin.utility.ControllerFactory;

public class ControllerTest {
	
	private LinkdinControllerInterface li;

	@Before
	public void setUp() throws Exception {
		li=ControllerFactory.createObject();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCreateprojectController() {
		fail("Not yet implemented");
	}

	@Test
	public void testViewprojectController() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteprojectController() {
		fail("Not yet implemented");
	}

	@Test
	public void testLoginprojectController() {
		fail("Not yet implemented");
	}

	@Test
	public void testSearchprojectController() {
		fail("Not yet implemented");
	}

}
