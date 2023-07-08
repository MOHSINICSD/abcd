package com.grizzlyweblab.springcore.componentscan;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import java.util.List;

@Component("res1")
@Scope("prototype")
public class Result {

	@Value("Pass")
	String grade;
	
	@Value("#{2024+2+2}")
	int year;
	
	//static method in EL
	@Value("#{T(java.lang.Math).sqrt(16)}")
	double sqr;
	
	//static field in EL
		@Value("#{T(java.lang.Math).PI}")
		double pi;
		
		//boolean
		@Value("#{10 > 50}")
		boolean res123;
	
		//object create
		@Value("#{new String('Mohsin')}")
		String name;
		
		
	@Value("#{list1}")
	List contacts;

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Result [grade=" + grade + ", year=" + year + ", sqr=" + sqr + ", pi=" + pi + ", res123=" + res123
				+ ", name=" + name + ", contacts=" + contacts + "]";
	}
	
	
}
