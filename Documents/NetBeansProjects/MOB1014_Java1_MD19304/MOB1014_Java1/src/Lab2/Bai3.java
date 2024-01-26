package Lab2;

import java.util.Scanner;

public class Bai3 {

    void b3() {
        double soDien, tien;
        Scanner scanner = new Scanner(System.in);
        System.out.print("So dien: ");
        soDien = scanner.nextDouble();
        if (soDien <= 50 && soDien >= 0) {
            tien = soDien * 1000;
            System.out.println("Tien dien: " + tien + "VND");
        } else if (soDien > 50) {
            tien = 50 * 1000 + (soDien - 50) * 1200;
            System.out.println("Tien dien: " + tien + "VND");
        }
    }
}
