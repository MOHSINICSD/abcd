package com.grizzlyweblab.springcore.autowireannotation;

public class Exam {

	String result;

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
		System.out.println("Setting Exam values");
	}

	@Override
	public String toString() {
		return "Exam [result=" + result + "]";
	}
	
	
}
