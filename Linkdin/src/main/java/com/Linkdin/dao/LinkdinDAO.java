package com.Linkdin.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Linkdin.entity.LinkdinUser;
import com.Linkdin.entity.TimelineEntity;

public class LinkdinDAO implements LinkdinDAOInterface {

	
	
		
	public int createprofileDAO(LinkdinUser lu) {
		int i=0;
     try {
    	 //step 1 driver
    	 Class.forName("oracle.jdbc.driver.OracleDriver");
    	 //step2 connecting
    	 Connection con=DriverManager.getConnection("jdbc:oracle:thin:@LAPTOP-R21I41JC:1521:XE","system","Aravind8*");
    	 //step 3 write a query
    	 PreparedStatement ps=con.prepareStatement("insert into Linkdin values(?,?,?,?) ");
    	 ps.setString(1, lu.getName());
    	 ps.setString(2, lu.getPassword());
    	 ps.setString(3, lu.getEmail());
    	 ps.setString(4, lu.getAddress());
    	 i=ps.executeUpdate();
    	 PreparedStatement ps1=con.prepareStatement("insert into Login values(?,?) ");
    	 ps1.setString(1, lu.getEmail());
    	 ps1.setString(2, lu.getPassword());
    	
    	 
    	 i=ps1.executeUpdate();
    	 
    	 
			
		}
		catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			
		}
		
		return i;
	
	}


	@Override
	public LinkdinUser viewprofileDAO(LinkdinUser lu) {
		
		LinkdinUser ll=null;
	     try {
	    	 //step 1 driver
	    	 Class.forName("oracle.jdbc.driver.OracleDriver");
	    	 //step2 connecting
	    	 Connection con=DriverManager.getConnection("jdbc:oracle:thin:@LAPTOP-R21I41JC:1521:XE","system","Aravind8*");
	    	 //step 3 write a query
	    	 PreparedStatement ps=con.prepareStatement("select * from Linkdin where email=? ");
	    	 ps.setString(1, lu.getEmail());
	    	
	    	 ResultSet res=ps.executeQuery();
	    	 if(res.next()) {
	    		 ll=new LinkdinUser();
	    		 ll.setName(res.getString(1));
	    		 ll.setPassword(res.getString(2));
	    		 ll.setEmail(res.getString(3));
	    		 ll.setAddress(res.getString(4));
	    	 }
	    	 
	    	 
				
			}
			catch(ClassNotFoundException | SQLException e) {
				e.printStackTrace();
				
			}
			
			return ll;
		
		}


	@Override
	public int deleteprofileDAO(LinkdinUser lu) {
		int i=0;
	     try {
	    	 //step 1 driver
	    	 Class.forName("oracle.jdbc.driver.OracleDriver");
	    	 //step2 connecting
	    	 Connection con=DriverManager.getConnection("jdbc:oracle:thin:@LAPTOP-R21I41JC:1521:XE","system","Aravind8*");
	    	 //step 3 write a query
	    	 PreparedStatement ps=con.prepareStatement("delete from Login where email=? ");
	    	 ps.setString(1, lu.getEmail());
	    	
	    	 i=ps.executeUpdate();
	    	 
	    	 PreparedStatement ps1=con.prepareStatement("delete from Linkdin where email=? ");
	    	 ps1.setString(1, lu.getEmail());
	    	
	    	 i=ps1.executeUpdate();
	    	 
	    	 
				
			}
			catch(ClassNotFoundException | SQLException e) {
				e.printStackTrace();
				
			}
			
			return i;
	}

	@Override
	public LinkdinUser loginprofileDAO(LinkdinUser lu) {
		LinkdinUser ll=null;
		System.out.println(lu.getEmail()+lu.getPassword());
	     try {
	    	 //step 1 driver
	    	 Class.forName("oracle.jdbc.driver.OracleDriver");
	    	 //step2 connecting
	    	 Connection con=DriverManager.getConnection("jdbc:oracle:thin:@LAPTOP-R21I41JC:1521:XE","system","Aravind8*");
	    	 //step 3 write a query
	    	 PreparedStatement ps=con.prepareStatement("select * from  Login where email=? and password=?");
	    	 ps.setString(1, lu.getEmail());
	    	 ps.setString(2, lu.getPassword());
	    	
	    	 ResultSet res=ps.executeQuery();
	    	 if(res.next()) {
	    		 ll=new LinkdinUser();
         		ll.setEmail(res.getString(1));
	    		 ll.setPassword(res.getString(2));
	    		 
	    		 
	    	 }
	    	 
	    	 
				
			}
			catch(ClassNotFoundException | SQLException e) {
				e.printStackTrace();
				
			}
			
			return ll;
	}


	@Override
	public List<TimelineEntity> timelineprofileDAO(LinkdinUser lu) {
		List<TimelineEntity> ll1=new ArrayList<TimelineEntity>();
		TimelineEntity te=new TimelineEntity();
		  try {
		    	 //step 1 driver
		    	 Class.forName("oracle.jdbc.driver.OracleDriver");
		    	 //step2 connecting
		    	 Connection con=DriverManager.getConnection("jdbc:oracle:thin:@LAPTOP-R21I41JC:1521:XE","system","Aravind8*");
		    	 //step 3 write a query
		    	 PreparedStatement ps=con.prepareStatement("select * from timeline where temail=? ");
		    	 ps.setString(1,te.getTemail());
		    	
		    	 ResultSet res=ps.executeQuery();
		    	 
		    	 while(res.next()) {
		    		 TimelineEntity ll=new TimelineEntity();
		    		 ll.setSender((res.getString(1)));
		    		 ll.setTimeofmessage((res.getString(2)));
		    		 ll.setMessage((res.getString(3)));
		    		 ll.setReciver((res.getString(4)));
		    		 ll.setSender(res.getString(5));
		    		 ll1.add(ll);
		    		 
		    	 }
		  }
		  
		  catch(ClassNotFoundException | SQLException e) {
				e.printStackTrace();
				
			}
			
			return ll1;
		  }


	@Override
	public LinkdinUser searchprofileDAO(LinkdinUser lu) {
		LinkdinUser ll2=null;
	     try {
	    	 //step 1 driver
	    	 Class.forName("oracle.jdbc.driver.OracleDriver");
	    	 //step2 connecting
	    	 Connection con=DriverManager.getConnection("jdbc:oracle:thin:@LAPTOP-R21I41JC:1521:XE","system","Aravind8*");
	    	 //step 3 write a query
	    	 PreparedStatement ps=con.prepareStatement("select * from Linkdin where name=? ");
	    	 ps.setString(1, lu.getName());
	    	
	    	 ResultSet res=ps.executeQuery();
	    	 if(res.next()) {
	    		 ll2=new LinkdinUser();
	    		 ll2.setName(res.getString(1));
	    		 ll2.setPassword(res.getString(2));
	    		 ll2.setEmail(res.getString(3));
	    		 ll2.setAddress(res.getString(4));
	    	 }
	    	 
	    	 
				
			}
			catch(ClassNotFoundException | SQLException e) {
				e.printStackTrace();
				
			}
			
			return ll2;
	}


	@Override
	public int editprofileDAO(LinkdinUser lu) {
		int i=0;
	     try {
	    	 //step 1 driver
	    	 Class.forName("oracle.jdbc.driver.OracleDriver");
	    	 //step2 connecting
	    	 Connection con=DriverManager.getConnection("jdbc:oracle:thin:@LAPTOP-R21I41JC:1521:XE","system","Aravind8*");
	    	 //step 3 write a query
	    	 PreparedStatement ps=con.prepareStatement("update  Linkdin set name=?,password=?,address=? where email=? ");
	    	 
	    	ps.setString(1, lu.getName());
	    	ps.setString(2, lu.getPassword());
	    	
	    	 ps.setString(3, lu.getAddress());
	    	 ps.setString(4, lu.getEmail());
	    	 
	    	 i=ps.executeUpdate();
	    	 con.commit();
	    	
				
			}
			catch(ClassNotFoundException | SQLException e) {
				e.printStackTrace();
				
			}
			
			return i;
		
	}
	}
		  



	
	


