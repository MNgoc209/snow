package Lab2;

import java.util.Scanner;

public class Bai4 {

    public static void B1() {
        Bai1 b1 = new Bai1();
        b1.b1();
    }

    public static void B2() {
        Bai2 b2 = new Bai2();
        b2.b2();
    }

    public static void B3() {
        Bai3 b3 = new Bai3();
        b3.b3();
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        int chon;
        do {
            System.out.println("============");
            System.out.println("1. Giai phuong trinh bac nhat");
            System.out.println("2. Giai phuong trinh bac 2");
            System.out.println("3. Tinh tien dien");
            System.out.println("4. Ket thuc");
            System.out.println("============");
            System.out.print("Chon bai ");
            chon = scanner.nextInt();
            switch (chon) {
                case 1:
                    B1();
                    break;
                case 2:
                    B2();
                    break;
                case 3:
                    B3();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("chon 1-4");
                    break;
            }
        } while (chon != 4);
    }

    public static void main(String[] args) {
        menu();
    }
}
