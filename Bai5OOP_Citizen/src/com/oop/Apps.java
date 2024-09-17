package com.oop;

public class Apps {

	public static void main(String[] args) {
		Citizen c1 = new Citizen();
		c1.setId("004");
		c1.setYear((short)2004);
		c1.setName("Phạm Phước Tài");
		c1.setGender("Male");
		c1.setNation("VietNam");
		System.out.println(c1.toString());
		Citizen c2 = new Citizen("005","Jerry",(short)1945,"female","EN");
		System.out.println(c2.toString());
	}

}
