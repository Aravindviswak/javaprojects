package com.Linkdin.entity;

import java.time.LocalTime;

public class TimelineEntity {
	private String sender;
	private String timeofmessage;
	private String message;
	private String reciver;
	private String temail;
	
	public String getTemail() {
		return temail;
	}
	public void setTemail(String temail) {
		this.temail = temail;
	}
	public String getReciver() {
		return reciver;
	}
	public void setReciver(String reciver) {
		this.reciver = reciver;
	}
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getTimeofmessage() {
		return timeofmessage;
	}
	public void setTimeofmessage(String timeofmessage) {
		this.timeofmessage = timeofmessage;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	

}
