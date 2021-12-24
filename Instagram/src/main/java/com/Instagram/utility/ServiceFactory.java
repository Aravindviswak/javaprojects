package com.Instagram.utility;

import com.Instagram.Service.InstagramService;
import com.Instagram.Service.InstagramServiceInterface;

public class ServiceFactory {
	private ServiceFactory() {
		
	}
	public static InstagramServiceInterface createObject() {
		// TODO Auto-generated method stub
		return new InstagramService();
	}

}
