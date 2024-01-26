package Lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Bai3 {

    public static void main(String[] args) {
        int[] mang = new int[3];
        int min;
        int tong = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < mang.length; i++) {
            System.out.printf("%d: ", i);
            mang[i] = scanner.nextInt();

            if (mang[i] % 3 == 0) {
                tong += mang[i];
            }
        }
        Arrays.sort(mang);
        System.out.println("Sap xep: " + Arrays.toString(mang));
        System.out.println("Tong: " + tong);
    }
}
