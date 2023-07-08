package com.grizzlyweblab.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Staff {
	
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Setting Staff Name");
		this.name = name;
	}

	@PostConstruct
	public void start() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Staff Init called");
	}

	@PreDestroy
	public void end() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Staff Destroy called");
	}
	
}
