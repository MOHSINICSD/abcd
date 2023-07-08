package com.grizzlyweblab.springcore.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context= new ClassPathXmlApplicationContext("com/grizzlyweblab/springcore/scope/scopeconfig.xml");
		
		//using property injection
		Result r1 = context.getBean("res1", Result.class);
		System.out.println(r1.hashCode());
		
		Result r2 = context.getBean("res1", Result.class);
		System.out.println(r2.hashCode());

		Result r3 = context.getBean("res2", Result.class);
		System.out.println(r3.hashCode());
		
		Result r4 = context.getBean("res2", Result.class);
		System.out.println(r4.hashCode());
		
		Result r5 = context.getBean("res3", Result.class);
		System.out.println(r5.hashCode());
		
		Result r6 = context.getBean("res3", Result.class);
		System.out.println(r6.hashCode());
		
		
		
		
	}

}
