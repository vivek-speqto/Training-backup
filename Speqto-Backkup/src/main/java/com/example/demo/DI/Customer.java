package com.example.demo.DI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customer {

	private int cust_id;
	private String cust_name;
	private String course_name;
	@Autowired
	private Technologies tech_details;
	
	
	
	public Technologies getTech_details() {
		return tech_details;
	}
	public void setTech_details(Technologies tech_details) {
		this.tech_details = tech_details;
	}
	public int getCust_id() {
		return cust_id;
	}
	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}
	public String getCust_name() {
		return cust_name;
	}
	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	public void display()
	{
		System.out.println("Object created");
		tech_details.tech();
	}
	
}
