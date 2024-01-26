package Lab2;

import java.util.Scanner;

public class Bai1 {

    void b1() {
        double a, b, dapAn;
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        a = scanner.nextDouble();
        System.out.print("b = ");
        b = scanner.nextDouble();
        if (a == 0) {
            if (b == 0) {
                System.out.println("Vo so nghiem");
            } else {
                System.out.println("Vo nghiem");
            }
        } else {
            dapAn = -b / a;
            System.out.println("Dap an: " + dapAn);
        }
    }
}
