package com.inter;

import java.util.ArrayList;

public class News implements INews {
	private int id;
	private String title;
	private String publicDate;
	private String author;
	private String content;
	private float averageRate;
	public int[] rateList = {1,2,3};
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public float getAverageRate() {
		return averageRate;
	}
	public void calculate() {
		this.averageRate = (float)(rateList[0]+rateList[1]+rateList[2])/3.0f;
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Title: "+this.getTitle()+"\nPublicDate: "
				+ this.getPublicDate() +"\nAuthor: "+this.getAuthor()
				+"\nAverageRate: "+ this.getAverageRate());
	}
	
	
}
