package com.Linkdin.utility;

import com.Linkdin.service.LinkdinService;
import com.Linkdin.service.LinkdinServiceInterface;

public class ServiceFactory {
	private ServiceFactory() {
		
	}

	public static LinkdinServiceInterface createObject() {
		// TODO Auto-generated method stub
		return new LinkdinService();
	}

}
