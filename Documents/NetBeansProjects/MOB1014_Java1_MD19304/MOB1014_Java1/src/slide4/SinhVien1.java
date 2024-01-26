package slide4;

public class SinhVien1 {

    private String hoTen;
    private double diem;

    public SinhVien1() {
    }

    public SinhVien1(String hoTen, double diem) {
        this.hoTen = hoTen;
        this.diem = diem;
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
        if (diem < 0 && diem > 10) {
            System.out.println("Khong hop le");
        } else {
            this.diem = diem;
        }
    }

    public void xuat() {
        System.out.println("ten: " + hoTen);
        System.out.println("diem: " + diem);
    }

    public static void main(String[] args) {
        SinhVien1 sv1 = new SinhVien1();
        sv1.setHoTen("ngoc");
        sv1.setDiem(-9);
        sv1.xuat();

//        SinhVien1 sv2 = new SinhVien1();
//        sv2.setHoTen("minh");
//        sv2.setDiem(0);
//
//        SinhVien1 sv3 = new SinhVien1();
//        sv3.setHoTen("nguyen");
//        sv3.setDiem(8);
    }
}
