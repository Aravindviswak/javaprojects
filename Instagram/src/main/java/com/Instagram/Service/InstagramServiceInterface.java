package com.Instagram.Service;

import java.util.List;

import com.Instagram.entity.InstagramUser;
import com.Instagram.exception.UserNotFoundException;

public interface InstagramServiceInterface {

	int CreateprofileService(InstagramUser ur);

	InstagramUser[] ViewprofileService();

	public List<InstagramUser> ViewprofileService1();

	InstagramUser ViewpersonProfileService(InstagramUser su);

	InstagramUser viewProfileService(InstagramUser su) throws UserNotFoundException;

}
