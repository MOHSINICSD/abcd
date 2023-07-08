package com.grizzlyweblab.spring.jdbc;

import java.util.Date;

public class Student {

	private long stdId;
	private String stdName;
	private Date stdDob;
	private String stdAddress;
	public long getStdId() {
		return stdId;
	}
	public void setStdId(long stdId) {
		this.stdId = stdId;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public Date getStdDob() {
		return stdDob;
	}
	public void setStdDob(Date stdDob) {
		this.stdDob = stdDob;
	}
	public String getStdAddress() {
		return stdAddress;
	}
	public void setStdAddress(String stdAddress) {
		this.stdAddress = stdAddress;
	}
	public Student(long stdId, String stdName, Date stdDob, String stdAddress) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.stdDob = stdDob;
		this.stdAddress = stdAddress;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", stdDob=" + stdDob + ", stdAddress=" + stdAddress
				+ "]";
	}
	
	
}
