package com.example.demo.DI;

import org.springframework.stereotype.Component;

@Component
public class Technologies {

	private int tech_id;
	private String tech_name;
	public int getTech_id() {
		return tech_id;
	}
	public void setTech_id(int tech_id) {
		this.tech_id = tech_id;
	}
	public String getTech_name() {
		return tech_name;
	}
	public void setTech_name(String tech_name) {
		this.tech_name = tech_name;
	}

	public void tech()
	{
		System.out.println("TEch object created successfully");
	}
	
}
