package Lap3;

public class Student {

    private String hoTen;
    private double diem;
    private String chuyenNganh;

    public Student() {
    }

    public Student(String hoTen, double diem, String chuyenNganh) {
        this.hoTen = hoTen;
        this.diem = diem;
        this.chuyenNganh = chuyenNganh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    public String getGrade() {
        if (this.diem < 3) {
            return "Kém";
        }
        if (this.diem < 5) {
            return "Yếu";
        }
        if (this.diem < 6.5) {
            return "Trung bình";
        }
        if (this.diem < 7.5) {
            return "Khá";
        }
        if (this.diem < 9) {
            return "Giỏi";
        }
        return "Xuất sắc";
    }

    public boolean isBonus() {
        return this.diem >= 7.5;
    }
}
