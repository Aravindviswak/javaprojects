package com.Instagram.Controller;
import com.Instagram.utility.*;
import java.util.*;
import java.lang.*;
import com.Instagram.exception.*;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.Instagram.Service.InstagramService;
import com.Instagram.Service.InstagramServiceInterface;
import com.Instagram.entity.*;
//responsibility of controller is take request and pass to service and take response from service and pass to view
public class InstagramController implements InstagramControllerInterface {

	public int CreateProject() {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Name");
		String name=sc.next();
		
		System.out.println("Enter password");
		String password=sc.next();
		
		System.out.println("Enter Email");
		String email=sc.next();
		
		System.out.println("Enter Address");
		String address=sc.next();
		
		//now above it will pass service inform of object because of data transfer object design pattern .object of what? object of entity class.
		
		InstagramUser ur=new InstagramUser();
		ur.setName(name);
		ur.setPassword(password);
		ur.setEmail(email);
		ur.setAddress(address);
		
		//now above object controller will pass to service
		//InstagramServiceInterface ss=new InstagramService();
		InstagramServiceInterface ss=ServiceFactory.createObject();
		int i=ss.CreateprofileService(ur);
		
		
		return i;
	}

	public int ViewProject() {
		int aa=0;
		InstagramServiceInterface ss=new InstagramService();
		InstagramUser a[]=ss.ViewprofileService();
		for(InstagramUser s3:a) {
			if(s3!=null) {
				System.out.println("***********************");
				System.out.println("name is"+s3.getName());
				System.out.println("Password is"+s3.getPassword());
				System.out.println("Emal is"+s3.getEmail());
				System.out.println("Address is"+s3.getAddress());
				aa++;
			}
			else {
				break;
			}
		}
		
		
		return aa;
	}
	public int ViewProject1() {
		int aa=0;
		InstagramServiceInterface ss=new InstagramService();
		List<InstagramUser> a=ss.ViewprofileService1();
		
		a.stream().filter(s->s.getAddress().equals("Pune")).map(v->v.getEmail()).forEach(c-> System.out.println(c));
//		System.out.println("before sorting");
//		for(InstagramUser s3:a) {
//			if(s3!=null) {
//				System.out.println("***********************");
//				System.out.println("name is"+s3.getName());
//				System.out.println("Password is"+s3.getPassword());
//				System.out.println("Emal is"+s3.getEmail());
//				System.out.println("Address is"+s3.getAddress());
//				aa++;
//			}
//			else {
//				break;
//			}
//		}
		Collections.sort(a, new Comparator_Demo());
		//System.out.println("after sorting");
		for(InstagramUser s3:a) {
			if(s3!=null) {
				System.out.println("***********************");
				System.out.println("name is"+s3.getName());
				System.out.println("Password is"+s3.getPassword());
				System.out.println("Emal is"+s3.getEmail());
				System.out.println("Address is"+s3.getAddress());
				aa++;
			}
			else {
				break;
			}
		}
		
		
		
		
		return aa;

}

	public int ViewpersonProfile() {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
		
		System.out.println("enter  name to view profile");
		String name=sc.next();
		
		InstagramUser su=new InstagramUser();
		su.setName(name);
		
		int i2=0;
		
		InstagramServiceInterface ss=ServiceFactory.createObject();
		try {
			InstagramUser s3=ss.viewProfileService(su);
		
		if(s3!=null) {
			System.out.println("name is "+s3.getName());
			System.out.println("Password is "+s3.getPassword());
			System.out.println("Email is "+s3.getEmail());
			System.out.println("Address is "+s3.getAddress());
			i2=1;
		}
		}
		catch(UserNotFoundException e) {
			System.err.println(e);
		}
		return i2;
	}

	public int ViewpersonProject() {
		// TODO Auto-generated method stub
		return 0;
	}

	

	
}
