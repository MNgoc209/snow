package Lab3;

import java.util.Scanner;

public class Bai1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap a: ");
        int a = scanner.nextInt();
        if (a < 2) {
            System.out.println("Khong phai so nguyen to");
        }
        for (int i = 2; i < a - 1; i++) {
            if (a % i == 0) {
                System.out.println("khong phai so nguyen to");
                break;
            }
            System.out.println("la so nguyen to");
            break;
        }
    }
}
