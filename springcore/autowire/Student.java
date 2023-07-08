package com.grizzlyweblab.springcore.autowire;

public class Student {

	Exam exam;
	int year;
	

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Exam getExam() {
		return exam;
	}

	public void setExam(Exam exam) {
		this.exam = exam;
		System.out.println("Using Student setter");
	}

	public Student(Exam exam) {
		super();
		this.exam = exam;
		System.out.println("Using Student exam type constructor");
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Using default student constructor");
	}

	@Override
	public String toString() {
		return "Student [exam=" + exam + ", year=" + year + "]";
	}
	
	
}
