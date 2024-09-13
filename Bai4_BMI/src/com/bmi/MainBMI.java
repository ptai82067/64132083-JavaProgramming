package com.bmi;

import java.util.Scanner;
import java.util.InputMismatchException;

public class MainBMI {

    public static void main(String[] args) {
        Double chieuCao = null, canNang = null;
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            try {
                System.out.println("Nhập chiều cao (m):");
                chieuCao = scanner.nextDouble();
                break; // Thoát khỏi vòng lặp nếu nhập đúng số
            } catch (InputMismatchException e) {
                System.out.println("Vui lòng nhập một số hợp lệ.");
                scanner.next(); // Xóa đầu vào không hợp lệ
            }
        }
        
        while (true) {
            try {
                System.out.println("Nhập cân nặng (kg):");
                canNang = scanner.nextDouble();
                break; // Thoát khỏi vòng lặp nếu nhập đúng số
            } catch (InputMismatchException e) {
                System.out.println("Vui lòng nhập một số hợp lệ.");
                scanner.next(); // Xóa đầu vào không hợp lệ
            }
        }
        
        Double bMI = canNang / (chieuCao * chieuCao);
        System.out.println("Tình trạng sức khỏe:");
        if (bMI < 18.5) {
            System.out.println("Gầy");
        } else if (bMI >= 18.5 && bMI < 24.9) {
            System.out.println("Bình thường");
        } else if (bMI >= 24.9 && bMI <= 29.9) {
            System.out.println("Thừa cân");
        } else {
            System.out.println("Béo phì");
        }
    }
}
