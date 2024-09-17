package com.interf;

public class Cat implements IAnimal {
	private String category;
	private boolean gender;
	public void keu() {
		System.out.println("mèo méo meo mèo meo");
	}
	public Cat(String category, boolean gender) {
		super();
		this.category = category;
		this.gender = gender;
	}
	public Cat() {
		super();
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Cat [category=" + category + ", gender=" + gender + "]";
	}
	
}
