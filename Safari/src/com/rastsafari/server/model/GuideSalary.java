package com.rastsafari.server.model;

public class GuideSalary {
	private String date;
	private String safari;
	private int pay;
	
	public GuideSalary(String date,String safari,int pay) {
		this.date = date;
		this.safari = safari;
		this.pay = pay;
	}
	public String getDate() {
		return date;
	}
	public String getSafari() {
		return safari;
	}
	public int getPay() {
		return pay;
	}
}
