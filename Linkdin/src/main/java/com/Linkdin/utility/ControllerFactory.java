package com.Linkdin.utility;

import com.Linkdin.controller.LinkdinController;
import com.Linkdin.controller.LinkdinControllerInterface;

public class ControllerFactory {
	private ControllerFactory() {
		
	}

	public static LinkdinControllerInterface createObject() {
		// TODO Auto-generated method stub
		return new LinkdinController();
	}

}
