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
public class PhuongTrinhBacHai {
     public static void giai(Scanner sc) {
        System.out.println("Phuong trinh dang: ax^2 + bx + c = 0");
        System.out.print("Nhap a: ");
        int a = sc.nextInt();

        System.out.print("Nhap b: ");
        int b = sc.nextInt();

        System.out.print("Nhap c: ");
        int c = sc.nextInt();

        if (a == 0) {
            System.out.println("Day khong phai phuong trinh bac 2.");
            return;
        }

        int delta = b * b - 4 * a * c;
        System.out.println("Delta = " + delta);

        if (delta < 0) {
            System.out.println("Phuong trinh vo nghiem");
        } 
        else if (delta == 0) {
            if ((-b) % (2 * a) == 0) {
                int x = -b / (2 * a);
                System.out.println("Phuong trinh co 1 nghiem duy nhat: x = " + x);
            } else {
                System.out.println("Phuong trinh co 1 nghiem duy nhat nhung nghiem khong nguyen");
            }
        } 
        else {
            int sqrtDelta = (int) Math.sqrt(delta);

            if (sqrtDelta * sqrtDelta == delta) {
                int tu1 = -b + sqrtDelta;
                int tu2 = -b - sqrtDelta;
                int mau = 2 * a;

                if (tu1 % mau == 0 && tu2 % mau == 0) {
                    int x1 = tu1 / mau;
                    int x2 = tu2 / mau;

                    if (x1 != x2) {
                        System.out.println("Phuong trinh co 2 nghiem nguyen phan biet:");
                        System.out.println("x1 = " + x1);
                        System.out.println("x2 = " + x2);
                    } else {
                        System.out.println("Phuong trinh co 1 nghiem duy nhat: x = " + x1);
                    }
                } else {
                    System.out.println("Phuong trinh khong co 2 nghiem nguyen phan biet");
                }
            } else {
                System.out.println("Phuong trinh khong co 2 nghiem nguyen phan biet");
            }
        }
    }
}
