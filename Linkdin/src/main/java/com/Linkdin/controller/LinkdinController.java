package com.Linkdin.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import java.util.Scanner;

import com.Linkdin.entity.LinkdinUser;
import com.Linkdin.entity.TimelineEntity;
import com.Linkdin.service.LinkdinServiceInterface;
import com.Linkdin.utility.ServiceFactory;

public class LinkdinController implements LinkdinControllerInterface {
	Logger log=Logger.getLogger("LinkdinController");

	public int CreateprojectController() {
		log.info("Enter to Create profile");
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name:");
		String name=sc.next();
		System.out.println("Enter Password:");
		String password=sc.next();
		System.out.println("Enter Email:");
		String email=sc.next();
		System.out.println("Enter Address");
		String address=sc.next();
		
		LinkdinUser lu=new LinkdinUser();
		lu.setName(name);
		lu.setPassword(password);
		lu.setEmail(email);
		lu.setAddress(address);
		
		
		LinkdinServiceInterface ls=ServiceFactory.createObject();
		
		return ls.createprofileService(lu);
	
		
		
	}

	@Override
	public int viewprojectController() {
		log.info("Enter to view profile");
		int i=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Email:");
		String email=sc.next();
		LinkdinUser lu=new LinkdinUser();
		lu.setEmail(email);
       LinkdinServiceInterface ls=ServiceFactory.createObject();
       LinkdinUser lu1= ls.viewprofileService(lu);
       if(lu1!=null) {
    	   System.out.println("Name is :"+lu1.getName());
    	   System.out.println("Password is:"+lu1.getPassword());
    	   System.out.println("email is:"+lu1.getEmail());
    	   System.out.println("Address is:"+lu1.getAddress());
    	   i++;
       }
		
		return i;
	
		
		
		
	}

	@Override
	public int deleteprojectController() {
		log.info("Enter to delete profile");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter email:");
		String email=sc.next();
		LinkdinUser lu=new LinkdinUser();
		lu.setEmail(email);
		LinkdinServiceInterface ls=ServiceFactory.createObject();
	   
		int lu1= ls.deleteprofileService(lu);
		return lu1;
		
	}

	@Override
	public int loginprojectController() {
		log.info("Enter to login profile");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter email:");
		String email=sc.next();
		System.out.println("Enter Password:");
		String password=sc.next();
		
		LinkdinUser lu=new LinkdinUser();
		lu.setEmail(email);
		lu.setPassword(password);
		
		LinkdinServiceInterface ls=ServiceFactory.createObject();
		
		LinkdinUser uu=ls.loginprofileService(lu);
		if(uu!=null) {
			System.out.println("Welcom "+uu.getEmail());
			
			System.out.println("press  1 to view timeline");
			
			
			
			System.out.println("enter u r choose");
			int cc=sc.nextInt();
			switch(cc) {
			
			case 1:List<TimelineEntity> tresult=ls.timelineservice(lu);
			    
			    int i=0;
			    TimelineEntity te=new TimelineEntity();
			    System.out.println("enter your Temail:");
			    String temail=sc.next();
			    List<TimelineEntity> ts=new ArrayList<TimelineEntity>();
			    
			    System.out.println("sender is:");
			    String sender=sc.next();
			    System.out.println("reciver is:");
			    String reciver=sc.next();
			    
			    System.out.println("message is:");
			    String message=sc.next();
			    System.out.println("time is:");
			    String timeofmessage=sc.next();
			    ts.add(te);
//			    if(te!=null) {
//			    System.out.println("sender is"+te.getSender());
//			    System.out.println("reciver is"+te.getReciver());
//			    System.out.println("message is"+te.getMessage());
//			    System.out.println("time line is"+te.getTimeofmessage());
//			    System.out.println("temail is "+te.getTemail());
//			    i=1;
//			    }
			    
			    
//			    if(tresult!=null) {
//			    	System.out.println("aravind");
//			    	System.out.println("12:40:20");
//			    	System.out.println("SASI");
//			    	System.out.println("aravind");
//			    	System.out.println("aravind");
//			    	
//			    }
			      for(TimelineEntity ti:ts) {
			    	  System.out.println("sender is"+sender);
					    System.out.println("reciver is"+reciver);
					    System.out.println("time line is"+timeofmessage);
					    System.out.println("message is"+message);
					 
					    
			    	  
			      }
				break;
				default:System.out.println("wrong choice!!!!!!");
				
			}
		}
		
		
		return 0;
		
		
	}

	@Override
	public int searchprojectController() {
		log.info("Enter to search profile");
		int i=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name:");
		String name=sc.next();
		LinkdinUser lu=new LinkdinUser();
		lu.setName(name);
       LinkdinServiceInterface ls=ServiceFactory.createObject();
       LinkdinUser lu1= ls.searchprofileService(lu);
       if(lu1!=null) {
    	   System.out.println("Name is :"+lu1.getName());
    	   System.out.println("Password is:"+lu1.getPassword());
    	   System.out.println("email is:"+lu1.getEmail());
    	   System.out.println("Address is:"+lu1.getAddress());
    	   i++;
       }
		
		return i;
	
	}

	@Override
	public int editprojectController() {
		log.info("Enter to edit profile");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Email:");
		String email=sc.next();
		
		
		
		LinkdinUser lu=new LinkdinUser();
	
		lu.setEmail(email);
		System.out.println("enter Your name:");
		String name=sc.next();
		lu.setName(name);
		System.out.println("enter Your password:");
		String password=sc.next();
		lu.setName(password);
		System.out.println("enter Your address:");
		String address=sc.next();
		lu.setName(address);
	
		
		
		
		LinkdinServiceInterface ls=ServiceFactory.createObject();
		
		return ls.editprofileService(lu);
	
	}

}
