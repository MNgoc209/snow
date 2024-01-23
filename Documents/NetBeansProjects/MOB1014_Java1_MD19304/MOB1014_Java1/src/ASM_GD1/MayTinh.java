package ASM_GD1;

import java.util.Scanner;

public class MayTinh {

    private String ten;
    private Double gia;

    public MayTinh() {
    }

    public MayTinh(String ten, Double gia) {
        this.ten = ten;
        this.gia = gia;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Double getGia() {
        return gia;
    }

    public void setGia(Double gia) {
        this.gia = gia;
    }

    public Double getThue() {
        return gia * 0.15;
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten may tinh: ");
        ten = scanner.nextLine();
        System.out.print("Nhap gia may tinh: ");
        gia = scanner.nextDouble();
    }

    public void xuat() {
        System.out.println("Ten may tinh: " + this.ten);
        System.out.println("Gia may tinh:" + this.gia);
        System.out.println("Thue:" + this.getThue());
    }

    static void mt() {
        MayTinh mt1 = new MayTinh();
        mt1.nhap();
        mt1.xuat();
        System.out.println("");
        MayTinh mt2 = new MayTinh();
        mt2.nhap();
        mt2.xuat();
    }
}
