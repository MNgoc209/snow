package Test1;

import java.io.Serializable;

public class Sinh implements Serializable {

    private String hoTen;
    private String ngaySinh;
    private double diem;
    private String gioiTinh;
    private String chuyenNganh;

    public Sinh() {
    }

    public Sinh(String hoTen, String ngaySinh, double diem, String gioiTinh, String chuyenNganh) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diem = diem;
        this.gioiTinh = gioiTinh;
        this.chuyenNganh = chuyenNganh;
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

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    public boolean isStudy() {
        return diem >= 5;
    }
}
