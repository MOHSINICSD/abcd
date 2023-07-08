package com.grizzlyweblab.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLifeCycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractApplicationContext context= new ClassPathXmlApplicationContext("com/grizzlyweblab/springcore/lifecycle/lifecycleconfig.xml");
		
		//Using XML config for init and destroy
		Employee e1=(Employee)context.getBean("RefEmployee");
		System.out.println("Employee Name is : "+e1.getName());
		
		//Using Spring Interfaces for init and destroy
		Teacher t1=(Teacher)context.getBean("RefTeacher");
		System.out.println("Teacher Name is : "+t1.getName());
		
		context.registerShutdownHook();
		
		
		
	}

}
