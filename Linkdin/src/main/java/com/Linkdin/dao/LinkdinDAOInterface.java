package com.Linkdin.dao;

import java.util.List;

import com.Linkdin.entity.LinkdinUser;
import com.Linkdin.entity.TimelineEntity;

public interface LinkdinDAOInterface {

	int createprofileDAO(LinkdinUser lu);

	LinkdinUser viewprofileDAO(LinkdinUser lu);

	int deleteprofileDAO(LinkdinUser lu);

	LinkdinUser loginprofileDAO(LinkdinUser lu);

	List<TimelineEntity> timelineprofileDAO(LinkdinUser lu);

	LinkdinUser searchprofileDAO(LinkdinUser lu);



	

	int editprofileDAO(LinkdinUser lu);

	

	
	

}
