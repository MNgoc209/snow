package Lab4;

import java.util.Scanner;

public class SanPham {

    private String tenSP;
    private double donGia;
    private double giamGia;

    public SanPham() {
    }

    public SanPham(String tenSP, double donGia, double giamGia) {
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public SanPham(String tenSP, double donGia) {
        this(tenSP, donGia, 0);
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }

    public double getThueNhapKhau() {
        return donGia * 0.1;
    }

    public double getThanhTien() {
        return donGia - giamGia + getThueNhapKhau();
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten san pham: ");
        tenSP = sc.nextLine();

        System.out.print("Nhap gia san pham: ");
        donGia = sc.nextDouble();

        System.out.print("Giam: ");
        giamGia = sc.nextDouble();
    }

    public void xuat() {
        System.out.println("San pham: " + tenSP);
        System.out.println("Gia: " + donGia);
        System.out.println("Giam: " + giamGia);
        System.out.println("Thue: " + getThueNhapKhau());
        System.out.println("Thanh tien: " + getThanhTien());
    }

    public static void main(String[] args) {
        SanPham sp1 = new SanPham("SP001", 12000);
//        sp1.nhap();
        sp1.xuat();

        System.out.println("");

        SanPham sp2 = new SanPham();
        sp2.nhap();
        sp2.xuat();
    }
}
