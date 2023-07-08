package com.grizzlyweblab.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;


public class Teacher implements InitializingBean, DisposableBean{
	
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Setting Teacher Name");
		this.name = name;
	}

	//@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Teacher Init called");
	}

	//@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Teacher Destroy called");
	}
	
}
