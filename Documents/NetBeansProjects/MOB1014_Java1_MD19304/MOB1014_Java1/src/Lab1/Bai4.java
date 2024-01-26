package Lab1;

import java.util.Scanner;

public class Bai4 {

    public static void main(String[] args) {
        double a, b, c, delta, canDelta;
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        a = scanner.nextDouble();
        System.out.print("b = ");
        b = scanner.nextDouble();
        System.out.print("c = ");
        c = scanner.nextDouble();
        delta = Math.pow(b, 2) - 4 * a * c;
        canDelta = Math.sqrt(delta);
        System.out.println("Delta: " + delta);
        System.out.println("Can Delta: " + canDelta);
    }
}
