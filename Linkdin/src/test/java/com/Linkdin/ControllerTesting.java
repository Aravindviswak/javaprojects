package com.Linkdin;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.Linkdin.controller.LinkdinControllerInterface;
import com.Linkdin.utility.ControllerFactory;

public class ControllerTesting {
	private LinkdinControllerInterface lc;

	@Before
	public void setUp() throws Exception {
		lc=ControllerFactory.createObject();
	}

	@After
	public void tearDown() throws Exception {
		lc=null;
	}

	@Test
	public void testCreateprojectController() {
		int i=lc.CreateprojectController();
		assert i>0:"profile creation fails";
	}

	@Test
	public void testViewprojectController() {
		int i=lc.viewprojectController();
		assert i>0:"profile View fails";
	}

	@Test
	public void testDeleteprojectController() {
		int i=lc.deleteprojectController();
		assert i>0:"profile delection fails";
	}

	@Test
	public void testLoginprojectController() {
		int i=lc.loginprojectController();
		assert i>0:"profile login fails";
	}

	@Test
	public void testSearchprojectController() {
		int i=lc.searchprojectController();
		assert i>0:"profile search fails";
	}
	@Test
	public void testEditprojectController() {
		int i=lc.editprojectController();
		assert i>0:"profile edit fails";
	}

}
