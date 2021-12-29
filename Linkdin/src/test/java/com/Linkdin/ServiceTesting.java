package com.Linkdin;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.Linkdin.entity.LinkdinUser;
import com.Linkdin.service.LinkdinServiceInterface;
import com.Linkdin.utility.ServiceFactory;

public class ServiceTesting {
	private LinkdinServiceInterface ls;
	

	@Before
	public void setUp() throws Exception {
		ls=ServiceFactory.createObject();
	}

	@After
	public void tearDown() throws Exception {
		ls=null;
	}

	@Test
	public void testCreateprofileService() {
		LinkdinUser lu=new LinkdinUser();
		lu.setName("aravind3113331");
		lu.setPassword("1234413331");
		lu.setEmail("aravind3113313@gmail.com");
		lu.setAddress("hydrabed.");
		int i=ls.createprofileService(lu);
		
		assert i>0: "Profile Creation Failed";
	}

	@Test
	public void testViewprofileService() {
		LinkdinUser lu=new LinkdinUser();
		lu.setEmail("aravind34@gmail.com");
		LinkdinUser i=ls.viewprofileService(lu);
		assert i!=null:"no records";
		
		
	}

	@Test
	public void testDeleteprofileService() {
		LinkdinUser lu=new LinkdinUser();
		lu.setEmail("aravind31@gmail.com");
		int i=ls.deleteprofileService(lu);
		
		assert i>0: "Deletion Failed";
	}

	@Test
	public void testLoginprofileService() {
		LinkdinUser lu=new LinkdinUser();
		lu.setEmail("aravind34@gmail.com");
		lu.setPassword("aravind");
		LinkdinUser i=ls.loginprofileService(lu);
		assert i!=null:"login fails";
	}

//	@Test
//	public void testTimelineservice() {
//		
//	}

	@Test
	public void testSearchprofileService() {
		LinkdinUser lu=new LinkdinUser();
		lu.setName("aravind");
		LinkdinUser i=ls.searchprofileService(lu);
		assert i!=null:"no records";
		
	
	}

	@Test
	public void testEditprofileService() {
		LinkdinUser lu=new LinkdinUser();
		lu.setEmail("aravind34@gmail.com");
		int i=ls.editprofileService(lu);
		assert i>0:"profile edits fails";
		
	}

}
