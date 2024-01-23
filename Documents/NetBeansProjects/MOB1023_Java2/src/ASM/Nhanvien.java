package ASM;

import java.io.Serializable;

public class Nhanvien implements Serializable{

    private String ma;
    private String hoTen;
    private int tuoi;
    private String email;
    private double luong;

    public Nhanvien() {
    }

    public Nhanvien(String ma, String hoTen, int tuoi, String email, double luong) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.email = email;
        this.luong = luong;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

}
