package com.Linkdin.view;

import java.util.Scanner;

import com.Linkdin.controller.LinkdinControllerInterface;
import com.Linkdin.utility.ControllerFactory;

public class Linkdinview {

	public static void main(String[] args) {
		String s="y";
		while(s.equals("y")) {
		System.out.println("\t\t\t|-----------Main Project------------|");
		System.out.println("\t\t\tPress 1 to create Profile");
		System.out.println("\t\t\tpress 2 to view profile");
		System.out.println("\t\t\tpress 3 to delete profile");
		System.out.println("\t\t\tPress 4 to login profile for time line");
		System.out.println("\t\t\tpress 5 to search  profile");
		System.out.println("\t\t\tpress 6 to edit profile");
		Scanner sc=new Scanner(System.in);
		int c=sc.nextInt();
		
		LinkdinControllerInterface lc=ControllerFactory.createObject();
		
		switch(c) {
		case 1:
			int i=lc.CreateprojectController();
			if(i>0) {
				System.out.println("profile is created");
			}
			else {
				System.out.println(" profile is not created");
			}
			break;
		case 2:
			int i1=lc.viewprojectController();
			if(i1>0) {
				System.out.println("profile is found");
			}
			else {
				System.out.println("no profile is found");
			}
			break;
		case 3:
			int i2=lc.deleteprojectController();
			if(i2>0) {
				System.out.println("profile is deleted");
			}
			else {
				System.out.println("no profile is deleted");
			}
			break;
		case 4:
			int i3=lc.loginprojectController();
			if(i3>0) {
				System.out.println("WELCOME ARAVIND!!!");
				 
				
			}
			else {
				
			}
			break;
		case 5:
			int i4=lc.searchprojectController();
			if(i4>0) {
				System.out.println("profile is found");
			}
			else {
				System.out.println("no profile is found");
			}
			break;
		case 6:
			int i5=lc.editprojectController();
			if(i5>0) {
				System.out.println("profile is edited");
			}
			else {
				System.out.println("no profile is edited");
			}
			break;
		
		
			default:System.out.println("wrong choise!!!!");
		}
		
		
		
		
		
		System.out.println("if you want to repeat process press y");
		s=sc.next();
		
		}
		

	}

}
