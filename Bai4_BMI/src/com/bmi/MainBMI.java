package com.bmi;
//
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
                if(1.0 < chieuCao && chieuCao < 2.2)
                break;
                else{
                	System.out.println("Chiều cao không hợp lý, vui lòng nhập lại");
                }
            } catch (InputMismatchException e) {
                System.out.println("Vui lòng nhập một số hợp lệ.");
                scanner.next();
            }
        }
        
        while (true) {
            try {
                System.out.println("Nhập cân nặng (kg):");
                canNang = scanner.nextDouble();
                if(2 < canNang && canNang < 200)
                    break;
                    else{
                    	System.out.println("Cân nặng không hợp lý, vui lòng nhập lại");
                    }
            } catch (InputMismatchException e) {
                System.out.println("Vui lòng nhập một số hợp lệ.");
                scanner.next();
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
