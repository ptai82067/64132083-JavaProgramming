package com.book.manage;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	ArrayList<Book> listBook = new ArrayList<Book>();
		    public void menu() {
		    	int ID = 0;
		        // Hiển thị menu
		        System.out.println("******************************");
		        System.out.println("*        MENU CHÍNH          *");
		        System.out.println("******************************");
		        System.out.println("* 1. Insert new book         *");
		        System.out.println("* 2. View list of book       *");
		        System.out.println("* 3. Average price           *");
		        System.out.println("* 4. Exit                    *");
		        System.out.println("******************************");
		        System.out.println("Chọn số:");

		        Scanner scanner = new Scanner(System.in);
		        int i = scanner.nextInt();
		        scanner.nextLine();
		        while (true) {
		            switch (i) {
		                case 1:
		                	System.out.println("1.Insert new book");
		                    Book news = new Book();
		                    news.setId(ID);
		                    System.out.printf("Name: ");
		                    String ip = scanner.nextLine();
		                    news.setName(ip);
		                    System.out.printf("PublicDate: ");
		                    ip = scanner.nextLine();
		                    news.setPublicDate(ip);
		                    System.out.printf("Author: ");
		                    ip = scanner.nextLine();
		                    news.setAuthor(ip);
		                    System.out.printf("Language: ");
		                    ip = scanner.nextLine();
		                    news.setLaguage(ip);
		                    System.out.printf("Price fist:");
		                    int rate = scanner.nextInt();
		                    news.priceList[0] = rate;
		                    System.out.printf("Price second:");
		                    rate = scanner.nextInt();
		                    news.priceList[1] = rate;
		                    System.out.printf("Price third:");
		                    rate = scanner.nextInt();
		                    news.priceList[2] = rate;
		                    System.out.printf("Price four:");
		                    rate = scanner.nextInt();
		                    news.priceList[3] = rate;
		                    System.out.printf("Price five:");
		                    rate = scanner.nextInt();
		                    news.priceList[4] = rate;
		                    listBook.add(news);
		                    break;
		                case 2:
		                    System.out.println("View list news");
		                    for(Book n : listBook) {
		                    	n.display();
		                    	System.out.println("----------------------------");
		                    }
		                    break;
		                case 3:
		                    System.out.println("Average rate");
		                    for(Book n : listBook) {
		                    	n.calculate();
		                    	n.display();
		                    	System.out.println("----------------------------");
		                    }
		                    break;
		                case 4:
		                    System.out.println("Exit");
		                    return; // Thoát khỏi vòng lặp và kết thúc chương trình
		                default:
		                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
		            }
		            System.out.println("******************************");
			        System.out.println("*        MENU CHÍNH          *");
			        System.out.println("******************************");
			        System.out.println("* 1. Insert new book         *");
			        System.out.println("* 2. View list of book       *");
			        System.out.println("* 3. Average price           *");
			        System.out.println("* 4. Exit                    *");
			        System.out.println("******************************");
		            System.out.println("Chọn số:");
		            i = scanner.nextInt();
		            scanner.nextLine();
		        }
		    }

		    public static void main(String[] args) {
		        Menu menu = new Menu();
		        menu.menu();
		    }
	}

