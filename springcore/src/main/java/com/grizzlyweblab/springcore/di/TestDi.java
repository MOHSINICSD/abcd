package com.grizzlyweblab.springcore.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context= new ClassPathXmlApplicationContext("appconfig.xml");
		
		//using property injection
		Student std1 = (Student) context.getBean("RefStudent1");
		System.out.println(std1);
		
		//using constructor injection
		Student std2 = (Student) context.getBean("RefStudent2");
		System.out.println(std2);
		
		//using property injection with Ref type
		Student std3 = (Student) context.getBean("RefStudent3");
		System.out.println(std3);
		
		//using constructor injection with Ref type
		Student std4 = (Student) context.getBean("RefStudent4");
		System.out.println(std4);
		
	}

}
