package com.chanle;
//
import java.util.Scanner;
import java.util.InputMismatchException;

public class MainChanLe {
    public static void main(String[] args) {
        int a;
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            try {
                System.out.println("Nhập một số nguyên: ");
                a = scanner.nextInt();
                break; 
            } catch (InputMismatchException e) {
                System.out.println("Vui lòng nhập một số nguyên hợp lệ.");
                scanner.next(); 
            }
        }
        
        String border = "====================";
        System.out.println(border);
        if (a % 2 == 0) {
            System.out.println("Đây là số chẵn.");
        } else {
            System.out.println("Đây là số lẻ.");
        }
        System.out.println(border);
    }
}
