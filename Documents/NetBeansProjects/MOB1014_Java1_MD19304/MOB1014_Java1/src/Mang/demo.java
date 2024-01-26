package Mang;

import java.util.Arrays;
import java.util.Scanner;

public class demo {
    
    public static void main(String[] args) {
        /*
        //Cách khai báo mang
        int mang[];

        float[] mang2;
        float[] mang3 = {3.4f, 1.3f, 6.7f, 8.9f};

        String[] mang4 = new String[5];
        String[] mang5 = new String[]{"ngoc"};

        //
        int mang[] = {5, 2, 7, 9};
        System.out.println("Mang[0] = " + mang[0]);
        mang[0] = mang[2] + mang[3];
        System.out.println("" + mang[0]);

        //
        int mang2[] = {5, 2, 6, 9};
        for (int i = 1; i < mang2.length; i++) {
            System.out.printf("%d\t", mang2[i]);
        }
        System.out.println("");
        for (int item : mang2) {
            System.out.printf("%d\t", item);
        }

        //Tính tông tu các số chẵn cua mang
        int[] a = {2, 3, 4, 5, 7, 6, 9};
        double tong = 0;
        for (int x : a) {
            if (x % 2 == 0) {
                tong += x;
            }
        }
        System.out.println("\nTong = " + tong);
    }
        

        //
        int[] mang = new int[4];
        int tong = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap phan tu cho mang");
        for (int i = 0; i < mang.length; i++) {
            System.out.printf("mang[%d]", i);
            mang[i] = scanner.nextInt();
            tong = tong + mang[i];
        }
        System.out.println("Tong cac phan tu la: " + tong);
        double avg = tong / mang.length;
        System.out.println("Trung binh: " + avg);
        for (int item : mang) {
            System.out.println("Lap phuong cac phan tu: " + Math.pow(item, 3));
        }
        //
        int[] mang = {4, 5, 7, 6};
        System.out.println("" + Arrays.toString(mang));
        Arrays.sort(mang);
        System.out.println("" + Arrays.toString(mang));
        
        int a = Arrays.binarySearch(mang, 3);
        System.out.println("" + a);
        
        Arrays.fill(mang, 5);
        System.out.println("" + Arrays.toString(mang));
         */

        //Nhập mang 5 sinh vien
        String[] mang = new String[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten sinh vien: ");
        for (int i = 0; i < mang.length; i++) {
            System.out.printf("Ten sinh vien%d: ", i);
            mang[i] = scanner.nextLine();
            Arrays.sort(mang);
        }
    }
}
