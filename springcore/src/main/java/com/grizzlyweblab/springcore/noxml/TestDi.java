package com.grizzlyweblab.springcore.noxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);
		
		//using property injection
		Result r1 = context.getBean("res1", Result.class);
		System.out.println(r1);
		
		System.out.println(r1.hashCode());
		
		Result r2 = context.getBean("res1", Result.class);
		System.out.println(r2.hashCode());
		
		//Demo demo = context.getBean("getDemoObject", Demo.class);
		Demo demo = context.getBean("ef", Demo.class);
		System.out.println(demo);
		
	}

}
