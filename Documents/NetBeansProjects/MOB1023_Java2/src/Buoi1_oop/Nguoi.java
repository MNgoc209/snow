package Buoi1_oop;

public class Nguoi {

    /*
    * public: truy cập công khai
    * protected: truy cập trong cùng package và các lớp con
    * default: truy cập trong cùng package
    * private: truy cập trong class
     */
    private String hoTen;
    private int tuoi;

    public Nguoi(String hoTen, int tuoi) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
    }

    public Nguoi() {

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

    public void xuatThongTin() {
        System.out.println("Họ và Tên: " + this.hoTen);
        System.out.println("Tuổi: " + this.tuoi);
    }

    /*
        * Overload: nạp chồng
        * Trong cùng 1 class có 2 phương thức: cùng tên, nhưng khác tham số.
        * => Khi truyền tham số khác nhau thì sẽ gọi tới những hàm khác nhau.
     */
    public void xuatThongTin(int diem) {
        System.out.println(diem);
    }
}
