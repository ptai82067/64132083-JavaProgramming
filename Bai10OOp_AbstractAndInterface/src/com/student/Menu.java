package com.student;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	ArrayList<StudentMark> listStudent = new ArrayList<StudentMark>();
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
		        int semester = 0;
		        Scanner scanner = new Scanner(System.in);
		        int i = scanner.nextInt();
		        scanner.nextLine();
		        while (true) {
		            switch (i) {
		                case 1:
		                	System.out.println("1.Insert new Student");
		                	StudentMark news = new StudentMark();
		                    news.setId(ID++);
		                    System.out.printf("Name: ");
		                    String ip = scanner.nextLine();
		                    news.setFullName(ip);
		                    System.out.printf("Semester: ");
		                    semester = scanner.nextInt();
		                    scanner.nextLine();
		                    news.setSemester(i);
		                    System.out.printf("Class: ");
		                    ip = scanner.nextLine();
		                    news.setClass(ip);
		                    System.out.printf("Mark fist:");
		                    int rate = scanner.nextInt();
		                    news.subjectMarkList[0] = rate;
		                    System.out.printf("Mark second:");
		                    rate = scanner.nextInt();
		                    news.subjectMarkList[1] = rate;
		                    System.out.printf("Mark third:");
		                    rate = scanner.nextInt();
		                    news.subjectMarkList[2] = rate;
		                    System.out.printf("Mark four:");
		                    rate = scanner.nextInt();
		                    news.subjectMarkList[3] = rate;
		                    System.out.printf("Mark five:");
		                    rate = scanner.nextInt();
		                    news.subjectMarkList[4] = rate;
		                    listStudent.add(news);
		                    break;
		                case 2:
		                    System.out.println("View list of student");
		                    for(StudentMark n : listStudent) {
		                    	n.display();
		                    	System.out.println("----------------------------");
		                    }
		                    break;
		                case 3:
		                    System.out.println("Average mark");
		                    for(StudentMark n : listStudent) {
		                    	n.aveCal();
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


