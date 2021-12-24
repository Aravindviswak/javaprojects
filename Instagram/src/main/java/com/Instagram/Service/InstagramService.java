package com.Instagram.Service;

import java.util.List;
import com.Instagram.exception.*;

import com.Instagram.dao.InstagramDAO;
import com.Instagram.dao.InstagramDAOInterface;
import com.Instagram.entity.InstagramUser;
import com.Instagram.utility.DAOFactory;

public class InstagramService implements InstagramServiceInterface {

	public int CreateprofileService(InstagramUser ur) {
		// TODO Auto-generated method stub
		//InstagramDAOInterface  sd=new InstagramDAO();
		InstagramDAOInterface  sd=DAOFactory.createObject();
		return sd.createprofileDAO(ur);
	}
	//via array
	public InstagramUser[] ViewprofileService() {
		// TODO Auto-generated method stub
		//InstagramDAOInterface  sd=new InstagramDAO();
		InstagramDAOInterface  sd=DAOFactory.createObject();
		
		return sd.viewprofileDAO();
	}
	//via collection
	public List<InstagramUser> ViewprofileService1() {
		// TODO Auto-generated method stub
		//InstagramDAOInterface  sd=new InstagramDAO();
		InstagramDAOInterface  sd=DAOFactory.createObject();
		
		return sd.viewprofileDAO1();
	}
	public InstagramUser viewProfileService(InstagramUser su)throws UserNotFoundException {
		InstagramDAOInterface sd=DAOFactory.createObject();
		return sd.ViewpersonProfileDAO1(su);
	}
	public InstagramUser ViewpersonProfileService(InstagramUser su) {
		// TODO Auto-generated method stub
		return null;
	}

}
