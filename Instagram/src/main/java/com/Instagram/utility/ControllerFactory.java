package com.Instagram.utility;

import com.Instagram.Controller.InstagramController;
import com.Instagram.Controller.InstagramControllerInterface;

public class ControllerFactory {
	private ControllerFactory() {
		
	}
	public static InstagramControllerInterface createObject() {
		return new InstagramController();
	}

}
