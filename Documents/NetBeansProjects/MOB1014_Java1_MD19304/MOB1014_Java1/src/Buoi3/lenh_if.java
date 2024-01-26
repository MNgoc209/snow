package Buoi3;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class lenh_if {

    public static void main(String[] args) {
        try {
            double a;
            double can;
            Scanner scanner = new Scanner(System.in);
            System.out.print("a = ");
            a = scanner.nextDouble();
            if (a >= 0) {
                can = Math.sqrt(a);
                System.out.println("Can = " + can);
            } else {
                System.out.println("a >= 0");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
