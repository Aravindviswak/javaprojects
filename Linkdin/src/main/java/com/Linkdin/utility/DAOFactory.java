package com.Linkdin.utility;

import com.Linkdin.dao.LinkdinDAO;
import com.Linkdin.dao.LinkdinDAOInterface;

public class DAOFactory {
	private DAOFactory() {
		
	}

	public static LinkdinDAOInterface createObject() {
		// TODO Auto-generated method stub
		return new LinkdinDAO();
	}

}
