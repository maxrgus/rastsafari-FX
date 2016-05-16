package com.rastsafari.server.model;


/**
 * Support model class for generating salary reports
 * @author maxrg
 *
 */
public class GuideSalary {
	private String date;
	private String safari;
	private int pay;
	
	/**
	 * Default constructor
	 * @param date
	 * @param safari
	 * @param pay
	 */
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
