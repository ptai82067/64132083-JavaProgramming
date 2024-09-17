package com.student.management;

public class Student implements IStudent {
	private String fullName;
	private int id;
	private String dateOfBirth;
	private String Native;
	private String Class1;
	private String phoneNO;
	private int mobile;
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getNative() {
		return Native;
	}
	public void setNative(String native1) {
		Native = native1;
	}
	public String getClass1() {
		return Class1;
	}
	public void setClass1(String class1) {
		Class1 = class1;
	}
	public String getPhoneNO() {
		return phoneNO;
	}
	public void setPhoneNO(String phoneNO) {
		this.phoneNO = phoneNO;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	@Override
	public void display() {
		System.out.println("FullName: "+this.getFullName()+"\nID: "
				+ this.getId() +"\nClass: "+this.getClass1()
				+"\nDateOfBirth: "+this.getDateOfBirth()
				+"\nNative: "+ this.getNative()
				+"\nPhoneNo: "+ this.getPhoneNO()
				+"\nMobile: "+ this.getMobile());
		
	}
	
}
