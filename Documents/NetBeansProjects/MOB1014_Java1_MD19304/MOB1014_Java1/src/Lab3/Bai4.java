package Lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Bai4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong sinh vien: ");
        int soLuong = scanner.nextInt();
        String[] hoTen = new String[soLuong];
        double[] diem = new double[soLuong];
        String[] hocLuc = new String[soLuong];

        for (int i = 0; i < soLuong; i++) {
            System.out.print("Ho ten sinh vien: ");
            hoTen[i] = scanner.next();
            System.out.print("Diem: ");
            diem[i] = scanner.nextDouble();
            System.out.println("");

            if (diem[i] < 5) {
                hocLuc[i] = "Yeu";
                System.out.println("Yeu");
            } else if (diem[i] < 6.5) {
                hocLuc[i] = "Trung binh";
                System.out.println("Trung binh");
            } else if (diem[i] < 7.5) {
                hocLuc[i] = "Kha";
                System.out.println("Kha");
            } else if (diem[i] < 9) {
                hocLuc[i] = "Gioi";
                System.out.println("Gioi");
            } else {
                hocLuc[i] = "Xuat xac";
                System.out.println("Xuat xac");
            }
        }

        for (int i = 0; i < soLuong; i++) {
            System.out.println("Ho ten: " + hoTen[i]);
            System.out.println("Diem: " + diem[i]);
            System.out.println("Hoc luc: " + hocLuc[i]);
            System.out.println("");
        }
    }
}
