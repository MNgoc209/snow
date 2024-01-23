package LuyenTap;

import java.io.Serializable;

public class NhanVien implements Serializable {

    private String hoTen;
    private String ngaySinh;
    private double luong;

    public NhanVien() {
    }

    public NhanVien(String hoTen, String ngaySinh, double luong) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.luong = luong;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

}
