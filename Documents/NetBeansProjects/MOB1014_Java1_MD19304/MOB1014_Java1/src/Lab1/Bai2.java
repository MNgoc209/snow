package Lab1;

import java.util.Scanner;

public class Bai2 {

    public static void main(String[] args) {
        double chieuDai, chieuRong, chuVi, dienTich, canhNhoNhat;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Chieu dai = ");
        chieuDai = scanner.nextDouble();
        System.out.print("Chieu rong = ");
        chieuRong = scanner.nextDouble();
        chuVi = (chieuDai + chieuRong) * 2;
        dienTich = chieuDai * chieuRong;
        canhNhoNhat = Math.min(chieuDai, chieuRong);
        System.out.println("Chu vi: " + chuVi);
        System.out.println("Dien tich: " + dienTich);
        System.out.println("Canh nho nhat: " + canhNhoNhat);
    }
}
