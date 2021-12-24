package com.Instagram.dao;

import java.util.List;

import com.Instagram.entity.InstagramUser;
import com.Instagram.exception.UserNotFoundException;

public interface InstagramDAOInterface {

	int createprofileDAO(InstagramUser ur);

	InstagramUser[] viewprofileDAO();
	public  List<InstagramUser> viewprofileDAO1();

	InstagramUser ViewpersonProfileDAO1(InstagramUser su) throws UserNotFoundException;

}
