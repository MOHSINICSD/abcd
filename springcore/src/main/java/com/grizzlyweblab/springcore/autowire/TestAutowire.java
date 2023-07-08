package com.grizzlyweblab.springcore.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowire {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/grizzlyweblab/springcore/autowire/autowireconfig.xml");

		Student std = context.getBean("student", Student.class);
		System.out.println(std);
	}

}
