package javaapplication24;

import java.util.*;

public class Processor {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chon;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Cong, tru, nhan, chia");
            System.out.println("2. Giai phuong trinh bac 1");
            System.out.println("3. Giai phuong trinh bac 2");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon: ");
            chon = sc.nextInt();

            switch (chon) {
                case 1:
                    Calculator.tinhToan(sc);
                    break;
                case 2:
                    PhuongTrinhBacNhat.giai(sc);
                    break;
                case 3:
                    PhuongTrinhBacHai.giai(sc);
                    break;
                case 0:
                    System.out.println("Da thoat chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (chon != 0);

        sc.close();
    }
}
