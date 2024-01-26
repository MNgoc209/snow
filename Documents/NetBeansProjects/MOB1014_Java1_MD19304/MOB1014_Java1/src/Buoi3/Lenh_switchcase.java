package Buoi3;

import java.util.Scanner;

public class Lenh_switchcase {

    public static void main(String[] args) {
        int thang, nam;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap thang: ");
        thang = scanner.nextInt();
        System.out.print("Nhap nam: ");
        nam = scanner.nextInt();
        switch (thang) {
            case 1:
                System.out.println("31 ngay");
                break;
            case 2:
                if (nam % 4 == 0 && nam % 100 != 0) {
                    System.out.println("29 ngay");
                } else {
                    System.out.println("28 ngay");
                }
                break;
            case 3:
                System.out.println("31 ngay");
                break;
            case 4:
                System.out.println("30 ngay");
                break;
            case 5:
                System.out.println("31 ngay");
                break;
            case 6:
                System.out.println("31 ngay");
                break;
            case 7:
                System.out.println("30 ngay");
                break;
            case 8:
                System.out.println("31 ngay");
                break;
            case 9:
                System.out.println("30 ngay");
                break;
            case 10:
                System.out.println("31 ngay");
                break;
            case 11:
                System.out.println("30 ngay");
                break;
            case 12:
                System.out.println("31 ngay");
                break;
            default:
                System.out.println("Moi nhap thang: ");
                break;
        }
    }
}
