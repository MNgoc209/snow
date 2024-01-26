package slide4;

import java.util.Scanner;

public class SinhVien {

    private String tenSV;
    private double diemSV;

    public SinhVien() {
        tenSV = "ngocnm";
        diemSV = 8.0;
    }

    public SinhVien(String tenSV, Double diemSV) {
        this.tenSV = tenSV;
        this.diemSV = diemSV;
    }

    void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten sinh vien: ");
        tenSV = scanner.nextLine();
        System.out.print("Nhap diem sinh vien: ");
        diemSV = scanner.nextDouble();
    }

    String xetDiem() {
        if (diemSV > 8) {
            return "Xuat sac";
        }
        return "Trung binh";
    }

    void xuat() {
        System.out.println(">> Ten SV: " + tenSV);
        System.out.println(">> Diem SV: " + diemSV);
        System.out.println("Tong ket: " + xetDiem());
    }
}
