package com.Instagram.utility;

import com.Instagram.dao.InstagramDAO;
import com.Instagram.dao.InstagramDAOInterface;

public class DAOFactory {
	private DAOFactory() {
		
	}
	
    private static 	InstagramDAOInterface id;

	public static InstagramDAOInterface createObject() {
		if(id==null) {
			id=new InstagramDAO();
		}
		// TODO Auto-generated method stub
		return id;
	}

}
