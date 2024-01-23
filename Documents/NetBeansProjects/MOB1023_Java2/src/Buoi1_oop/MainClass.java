package Buoi1_oop;

public class MainClass {

    public static void main(String[] args) {
//        Nguoi n = new Nguoi();
//        n.hoTen = "Ng Van B";

        SinhVien sv = new SinhVien();
        sv.setHoTen("Ng Van C");
        sv.setTuoi(19);

        sv.xuatThongTin();
    }
}
