package com.book.manage;

public class Book implements IBook{
	private int id;
	private String name;
	private String publicDate;
	private String author;
	private String laguage;
	private float averagePrice;
	public int[] priceList = {1,2,3,4,5};
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPublicDate() {
		return publicDate;
	}
	public void setPublicDate(String publicDate) {
		this.publicDate = publicDate;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getLaguage() {
		return laguage;
	}
	public void setLaguage(String laguage) {
		this.laguage = laguage;
	}
	public float getAveragePrice() {
		return averagePrice;
	}
	public void calculate() {
		this.averagePrice = (float)(priceList[0]+priceList[1]+priceList[2]+priceList[3]+priceList[4])/3.0f;
	}
	@Override
	public void display() {
		System.out.println("Name: "+this.getName()+"\nPublicDate: "
				+ this.getPublicDate() +"\nAuthor: "+this.getAuthor()
				+"\nLanguage: "+this.getLaguage()
				+"\nAveragePrice: "+ this.getAveragePrice());
	}

	
}
