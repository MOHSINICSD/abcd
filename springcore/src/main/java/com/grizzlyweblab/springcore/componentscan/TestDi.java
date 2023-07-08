package com.grizzlyweblab.springcore.componentscan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context= new ClassPathXmlApplicationContext("com/grizzlyweblab/springcore/componentscan/config.xml");
		
		//using property injection
		Result r1 = context.getBean("res1", Result.class);
		System.out.println(r1);
		
		System.out.println(r1.hashCode());
		
		Result r2 = context.getBean("res1", Result.class);
		System.out.println(r2.hashCode());
		
		
		
	}

}
