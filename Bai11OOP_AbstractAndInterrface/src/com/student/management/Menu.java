package com.student.management;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	ArrayList<Student> listStudent = new ArrayList<Student>();
		    public void menu() {
		    	int ID = 0;
		        // Hiển thị menu
		        System.out.println("******************************");
		        System.out.println("*        MENU CHÍNH          *");
		        System.out.println("******************************");
		        System.out.println("* 1. Insert new book         *");
		        System.out.println("* 2. View list of book       *");
//		        System.out.println("* 3. Average price           *");
		        System.out.println("* 3. Exit                    *");
		        System.out.println("******************************");
		        System.out.println("Chọn số:");
		        int semester = 0;
		        Scanner scanner = new Scanner(System.in);
		        int i = scanner.nextInt();
		        scanner.nextLine();
		        while (true) {
		            switch (i) {
		                case 1:
		                	System.out.println("1.Insert new Student");
		                	Student news = new Student();
		                    news.setId(ID++);
		                    System.out.printf("Name: ");
		                    String ip = scanner.nextLine();
		                    news.setFullName(ip);
		                    System.out.printf("DateOfBirth: ");
		                    ip = scanner.nextLine();
		                    news.setDateOfBirth(ip);
		                    System.out.printf("Native: ");
		                    ip = scanner.nextLine();
		                    news.setNative(ip);
		                    System.out.printf("PhoneNo: ");
		                    ip = scanner.nextLine();
		                    news.setPhoneNO(ip);
		                    System.out.printf("Mobile: ");
		                    semester = scanner.nextInt();
		                    scanner.nextLine();
		                    news.setMobile(semester);
		                    System.out.printf("Class: ");
		                    ip = scanner.nextLine();
		                    news.setClass1(ip);		                    
		                    listStudent.add(news);
		                    break;
		                case 2:
		                    System.out.println("View list of student");
		                    for(Student n : listStudent) {
		                    	n.display();
		                    	System.out.println("----------------------------");
		                    }
		                    break;
		                case 3:
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
//			        System.out.println("* 3. Average price           *");
			        System.out.println("* 3. Exit                    *");
			        System.out.println("******************************");
		            System.out.println("Chọn số:");
		            i = scanner.nextInt();
		            scanner.nextLine();
		        }
		    }

		   
	}


