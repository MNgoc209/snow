package Lab4;

import java.util.Scanner;

public class NhanVien {

    private String maNV;
    private String tenNV;
    private double luongNV;
    private double thuong;

    public Double getThue() {
        if (luongNV < 9000) {
            return 0.0;
        }
        return luongNV * 0.1;
    }

    public Double getThuNhap() {
        return (luongNV + thuong) - getThue();
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ma nhan vien: ");
        maNV = scanner.nextLine();

        System.out.print("Nhap ten nhan vien: ");
        tenNV = scanner.nextLine();

        System.out.print("Nhap luong nhan vien: ");
        luongNV = scanner.nextDouble();

        System.out.print("Nhap thuong nhan vien: ");
        thuong = scanner.nextDouble();
    }

    public void xuat() {
        System.out.println("");
        System.out.println("Ma nhan vien: " + maNV);
        System.out.println("Ten nhan vien: " + tenNV);
        System.out.println("Luong nhan vien: " + luongNV);
        System.out.println("Thuong nhan vien: " + thuong);
        System.out.println("Thue: " + getThue());
        System.out.println("Thu nhap: " + getThuNhap());
    }

    public static void main(String[] args) {
        NhanVien nv1 = new NhanVien();
        nv1.nhap();
        nv1.xuat();

        System.out.println("");

        NhanVien nv2 = new NhanVien();
        nv2.nhap();
        nv2.xuat();
    }
}
