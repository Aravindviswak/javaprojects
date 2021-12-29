package com.Linkdin.service;

import java.util.List;

import com.Linkdin.entity.LinkdinUser;
import com.Linkdin.entity.TimelineEntity;

public interface LinkdinServiceInterface {

	int createprofileService(LinkdinUser lu);

	LinkdinUser viewprofileService(LinkdinUser lu);

	int deleteprofileService(LinkdinUser lu);

	LinkdinUser loginprofileService(LinkdinUser lu);

	List<TimelineEntity> timelineservice(LinkdinUser lu);

	LinkdinUser searchprofileService(LinkdinUser lu);

	int editprofileService(LinkdinUser lu);

	

}
