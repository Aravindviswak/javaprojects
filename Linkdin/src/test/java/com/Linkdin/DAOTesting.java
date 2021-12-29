package com.Linkdin;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.Linkdin.dao.LinkdinDAOInterface;
import com.Linkdin.entity.LinkdinUser;
import com.Linkdin.service.LinkdinServiceInterface;
import com.Linkdin.utility.DAOFactory;

public class DAOTesting {
	private LinkdinDAOInterface ld;

	@Before
	public void setUp() throws Exception {
		ld=DAOFactory.createObject();
	}

	@After
	public void tearDown() throws Exception {
		ld=null;
	}

	@Test
	public void testCreateprofileDAO() {
		LinkdinUser lu=new LinkdinUser();
		lu.setName("aravind3113");
		lu.setPassword("1234413");
		lu.setEmail("aravind3131@gmail.com");
		lu.setAddress("chennai.");
		int i=ld.createprofileDAO(lu);
		
		assert i>0: "Profile Creation Failed";
		
	}

	@Test
	public void testViewprofileDAO() {
		LinkdinUser lu=new LinkdinUser();
		lu.setEmail("aravind34@gmail.com");
		LinkdinUser i=ld.viewprofileDAO(lu);
		assert i!=null:"no records";
	}

	@Test
	public void testDeleteprofileDAO() {
		LinkdinUser lu=new LinkdinUser();
		lu.setEmail("ABC@gmail.com");
		int i=ld.deleteprofileDAO(lu);
		
		assert i>0: "Deletion Failed";
	}

	@Test
	public void testLoginprofileDAO() {
		LinkdinUser lu=new LinkdinUser();
		lu.setEmail("aravind34@gmail.com");
		lu.setPassword("aravind");
		LinkdinUser i=ld.loginprofileDAO(lu);
		assert i!=null:"login fails";
	}

//	@Test
//	public void testTimelineprofileDAO() {
//		fail("Not yet implemented");
//	}

	@Test
	public void testSearchprofileDAO() {
		LinkdinUser lu=new LinkdinUser();
		lu.setName("aravind");
		LinkdinUser i=ld.searchprofileDAO(lu);
		assert i!=null:"no records";
	}

	@Test
	public void testEditprofileDAO() {
		LinkdinUser lu=new LinkdinUser();
		lu.setEmail("aravind34@gmail.com");
		int i=ld.editprofileDAO(lu);
		assert i>0:"profile edits fails";
	}

}
