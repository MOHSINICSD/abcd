package com.grizzlyweblab.springcore.di;

public class Student {

	String name;
	int age;
	float fees;
	Result result;
	
	public Student(String name, int age, float fees, Result result) {
		super();
		this.name = name;
		this.age = age;
		this.fees = fees;
		this.result = result;
	}

	public Result getResult() {
		return result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public Student(String name, int age, float fees) {
		super();
		this.name = name;
		this.age = age;
		this.fees = fees;
	}
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", fees=" + fees + ", result=" + ((result==null)? "null" : result.getGrade()) + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getFees() {
		return fees;
	}
	public void setFees(float fees) {
		this.fees = fees;
	}
	
	
}
