
package javaapplication24;

import java.util.Scanner;

public class Calculator {
public static void tinhToan(Scanner sc) {
        System.out.print("Nhap so thu nhat: ");
        double a = sc.nextDouble();

        System.out.print("Nhap so thu hai: ");
        double b = sc.nextDouble();

        System.out.println("Tong = " + (a + b));
        System.out.println("Hieu = " + (a - b));
        System.out.println("Tich = " + (a * b));

        if (b != 0) {
            System.out.println("Thuong = " + (a / b));
        } else {
            System.out.println("Khong the chia cho 0");
        }
    }
  
  
    
}
