package com.Instagram.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;


import com.Instagram.entity.InstagramUser;
import com.Instagram.exception.UserNotFoundException;

public class InstagramDAO implements InstagramDAOInterface {
	
	private static InstagramUser uu[]=new InstagramUser[10];
	public static List<InstagramUser> uu1=new ArrayList<InstagramUser>();

	public int createprofileDAO(InstagramUser ur) {
		// TODO Auto-generated method stub
		//Array method Start
//		int i=0;
//		for(int j=0;j<uu.length;j++) {
//			if(uu[j]==null) {
//				uu[j]=ur;
//				i=1;
//				break;
//			}
//			
//		}
//		return i;
		//Array method End
		//collection method is start
		int i=0;
//		uu1.add(ur);
//		if(uu1.size()>0) {
//			i=1;
		//jdbc
		
		try {
			//step1 load driver to connect with oracle
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//step 2 connect with data base 	
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@LAPTOP-R21I41JC:1521","system","Aravind8*");
			//step3 create query
			PreparedStatement ps=con.prepareStatement("insert into Instagram values(?,?,?,?)");
			ps.setString(1, ur.getName());
			ps.setString(2, ur.getPassword());
			ps.setString(3, ur.getEmail());
			ps.setString(4, ur.getAddress());
			
			//execute query
			
			i=ps.executeUpdate();
			
			
		}
		catch(ClassNotFoundException | SQLException e){
			e.printStackTrace();
			
			
		}
		return i;
	}
	//via array concept
	public InstagramUser[] viewprofileDAO() {
		// TODO Auto-generated method stub
		return uu;
	}
	//via collection
	public  List<InstagramUser> viewprofileDAO1() {
		// TODO Auto-generated method stub
		return uu1;
		
	}
	public InstagramUser ViewpersonProfileDAO1(InstagramUser su) throws UserNotFoundException{
		InstagramUser ss=null;
		int i=0;
		for(InstagramUser su1:uu1) {
			if(su1.getName().equals(su.getName())) {
				ss=su1;
				i=1;
				break;
			}
		}
		if(i==0) {
			throw new UserNotFoundException();
		}
		return ss;
	}
	

}
