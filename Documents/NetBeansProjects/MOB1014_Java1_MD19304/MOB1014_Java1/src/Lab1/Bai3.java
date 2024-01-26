package Lab1;

import java.util.Scanner;

public class Bai3 {

    public static void main(String[] args) {
        double canh, theTich;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Canh = ");
        canh = scanner.nextDouble();
        theTich = Math.pow(canh, 3);
        System.out.println("The tich: " + theTich);
    }
}
