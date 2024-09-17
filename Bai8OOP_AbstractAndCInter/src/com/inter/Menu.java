package com.inter;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	ArrayList<News> listNews = new ArrayList<News>();
		    public void menu() {
		        // Hiển thị menu
		        System.out.println("******************************");
		        System.out.println("*        MENU CHÍNH          *");
		        System.out.println("******************************");
		        System.out.println("* 1. Insert news             *");
		        System.out.println("* 2. View list news          *");
		        System.out.println("* 3. Average rate            *");
		        System.out.println("* 4. Exit                    *");
		        System.out.println("******************************");
		        System.out.println("Chọn số:");

		        Scanner scanner = new Scanner(System.in);
		        int i = scanner.nextInt();
		        scanner.nextLine();
		        while (true) {
		            switch (i) {
		                case 1:
		                	System.out.println("1.Insert news");
		                    News news = new News();
		                    System.out.printf("Title: ");
		                    String ip = scanner.nextLine();
		                    news.setTitle(ip);
		                    System.out.printf("PublicDate: ");
		                    ip = scanner.nextLine();
		                    news.setPublicDate(ip);
		                    System.out.printf("Author");
		                    ip = scanner.nextLine();
		                    news.setAuthor(ip);
		                    System.out.printf("Content");
		                    ip = scanner.nextLine();
		                    news.setContent(ip);
		                    System.out.printf("Rate fist:");
		                    int rate = scanner.nextInt();
		                    news.rateList[0] = rate;
		                    System.out.printf("Rate second:");
		                    rate = scanner.nextInt();
		                    news.rateList[1] = rate;
		                    System.out.printf("Rate third:");
		                    rate = scanner.nextInt();
		                    news.rateList[2] = rate;
		                    listNews.add(news);
		                    break;
		                case 2:
		                    System.out.println("View list news");
		                    for(News n : listNews) {
		                    	n.display();
		                    	System.out.println("----------------------------");
		                    }
		                    break;
		                case 3:
		                    System.out.println("Average rate");
		                    for(News n : listNews) {
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
		            System.out.println("* 1. Insert news             *");
		            System.out.println("* 2. View list news          *");
		            System.out.println("* 3. Average rate            *");
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
