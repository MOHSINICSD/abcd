package com.grizzlyweblab.springcore.lifecycle;

public class Employee {
	
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Setting Employee Name");
		this.name = name;
	}
	
	public void init()
	{
		System.out.println("Employee Init called");
	}
	
	public void destroy()
	{
		System.out.println("Employee Destroy called");
	}

}
