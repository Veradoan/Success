/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication24;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class PhuongTrinhBacNhat {
      public static void giai(Scanner sc) {
        System.out.println("Phuong trinh dang: ax + b = 0");
        System.out.print("Nhap a: ");
        double a = sc.nextDouble();

        System.out.print("Nhap b: ");
        double b = sc.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh vo so nghiem");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        } else {
            double x = -b / a;
            System.out.println("Nghiem cua phuong trinh: x = " + x);
        }
    }
}
