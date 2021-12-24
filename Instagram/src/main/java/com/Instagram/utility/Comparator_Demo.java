package com.Instagram.utility;
import java.util.Comparator;
import com.Instagram.entity.InstagramUser;

public class Comparator_Demo implements Comparator<InstagramUser>{
	public int compare(InstagramUser o1,InstagramUser o2) {
		return o1.getName().compareTo(o2.getName());
	}
}
