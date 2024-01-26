package Buoi3;

import java.util.Scanner;

public class menu {

    public static void Nhap() {
        System.out.println("Nhap vao");
    }

    public static void Xuat() {
        System.out.println("Xuat ra");
    }

    public static void hienThiMenu() {
        System.out.println("============");
        System.out.println("Cac chuc nang");
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("============");
        System.out.println("Chon chuc nang");
        int chon;
        Scanner scanner = new Scanner(System.in);
        chon = scanner.nextInt();
        switch (chon) {
            case 1:
                Nhap();
                break;
            case 2:
                Xuat();
                break;
            case 3:
                System.out.println("gut byeee");
                break;
            default:
                System.out.println("chon 1-3");
                break;
        }
    }

    public static void main(String[] args) {
        hienThiMenu();
    }
}
