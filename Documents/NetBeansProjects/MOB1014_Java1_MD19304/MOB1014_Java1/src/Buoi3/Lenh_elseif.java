package Buoi3;

import java.util.Scanner;

public class Lenh_elseif {

    public static void main(String[] args) {
        double luong, thue;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap luong: ");
        luong = scanner.nextDouble();
        if (luong < 9000) {
            System.out.println("Khong dong thue");
        } else if (luong < 15000) {
            thue = 0.1 * luong;
            System.out.println("Luong sau thue: " + (luong - thue));
        } else if (luong < 30000) {
            thue = 0.15 * luong;
            System.out.println("Luong sau thue: " + (luong - thue));
        } else {
            thue = 0.2 * luong;
            System.out.println("Luong sau thue: " + (luong - thue));
        }
    }
}
