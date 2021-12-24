package com.Instagram;

import java.util.Scanner;
import com.Instagram.*;

import com.Instagram.Controller.InstagramController;
import com.Instagram.Controller.InstagramControllerInterface;
import com.Instagram.utility.ControllerFactory;

public class InstagramView {

	public static void main(String[] args) {
		String s="y";
		while(s.equals("y")){
		System.out.println("*****Main Project******");
		System.out.println("press 1 to Create Project");
		System.out.println("press 2 to View Project");
		System.out.println("press 3 to View person Project");
		System.out.println("enter your Choice");
		
		Scanner sc=new Scanner(System.in);
		int ch=sc.nextInt();
		
		//InstagramControllerInterface cr=new InstagramController();
		//
		InstagramControllerInterface cr=ControllerFactory.createObject();
		switch(ch) {
		case 1:
			int c1=cr.CreateProject();
			if(c1>0) {
				System.out.println("project Create Successfully");
			}
			else {
				System.out.println("No project is Found");
			}
		
			break;
		case 2:
			int c2=cr.ViewProject1();
			if(c2>0) {
				System.out.println(c2+"records found");
			}
			else {
				System.out.println("no records Found");
			}
			break;
		case 3:
			int j2 = cr.ViewpersonProfile();
			if (j2 > 0) {
				System.out.println("  record found");
			} 
			break;
			default:System.out.println("Wrong choice!");
		}
		System.out.println("Enter Y to reenter Details");
		 s=sc.next();
		}

	}

}