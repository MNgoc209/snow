package Lab2;

import java.util.Scanner;

public class Bai2 {

    void b2() {
        double a, b, c, dapAn = 0, dapAn1, delta;
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        a = scanner.nextDouble();
        System.out.print("b = ");
        b = scanner.nextDouble();
        System.out.print("c = ");
        c = scanner.nextDouble();
        delta = Math.pow(b, 2) - 4 * a * c;
        System.out.println("Delta = " + delta);

        // ax2 + bx + c = 0 -> x = -c/b
        if (a == 0) {
            if (b == 0) {
                System.out.println("PT 1: Vo nghiem");
            } else {
                dapAn = -c / b;
                System.out.println("Dap an: " + dapAn);
            }
        } else {
            if (delta < 0) {
                System.out.println("Vo nghiem");
            } else if (delta == 0) {
                dapAn = -b / (2 * a);
                System.out.println("Nghiem kep: " + dapAn);
            } else {
                dapAn = (-b + Math.sqrt(delta)) / (2 * a);
                dapAn1 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("2 nghiem phan biet");
                System.out.print("x1 = " + dapAn);
                System.out.print("x2 = " + dapAn1);
            }
        }
    }
}
