package Lap1;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tên SP: ");
        String name = sc.nextLine();
        System.out.print("Giá SP: ");
        double price = Double.parseDouble(sc.nextLine());

        Product p = new Product(name, price);
    }
}
