package com.Linkdin.service;

import java.util.List;
import java.util.logging.Logger;

import com.Linkdin.dao.LinkdinDAOInterface;
import com.Linkdin.entity.LinkdinUser;
import com.Linkdin.entity.TimelineEntity;
import com.Linkdin.utility.DAOFactory;

public class LinkdinService implements LinkdinServiceInterface {
	
	Logger log=Logger.getLogger("LinkdinService");


	public int createprofileService(LinkdinUser lu) {
		LinkdinDAOInterface ld=DAOFactory.createObject();
		return ld.createprofileDAO(lu);
	}

	@Override
	public LinkdinUser viewprofileService(LinkdinUser lu) {
		
		LinkdinDAOInterface ld=DAOFactory.createObject();
		return ld.viewprofileDAO(lu);
	}

	@Override
	public int deleteprofileService(LinkdinUser lu) {
		LinkdinDAOInterface ld=DAOFactory.createObject();
		return ld.deleteprofileDAO(lu);
	}

	@Override
	public LinkdinUser loginprofileService(LinkdinUser lu) {
		LinkdinDAOInterface ld=DAOFactory.createObject();
		return ld.loginprofileDAO(lu);
	}

	@Override
	public List<TimelineEntity> timelineservice(LinkdinUser lu) {
		LinkdinDAOInterface ld=DAOFactory.createObject();
		return ld.timelineprofileDAO(lu);
	}

	@Override
	public LinkdinUser searchprofileService(LinkdinUser lu) {
		LinkdinDAOInterface ld=DAOFactory.createObject();
		return ld.searchprofileDAO(lu);
	}

	@Override
	public int editprofileService(LinkdinUser lu) {
		LinkdinDAOInterface ld=DAOFactory.createObject();
		return ld.editprofileDAO(lu);
	}

	

	

}
