package ASM_GD1;

public class NhanVien {

    private String maNV;
    private String hoTen;
    private Double luong;

    public NhanVien() {
    }

    public NhanVien(String maNV, String hoTen, Double luong) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.luong = luong;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Double getLuong() {
        return luong;
    }

    public void setLuong(Double luong) {
        this.luong = luong;
    }

    public Double getThuNhap() {
        return this.luong;
    }

    public Double getThueTN() {
        if (this.getThuNhap() < 9000) {
            return 0.0;
        } else if (this.getThuNhap() < 15000) {
            return this.getThuNhap() * 0.1;
        } else {
            return this.getThuNhap() * 0.12;
        }
    }

    public void xuat() {
        System.out.println("");
        System.out.println("Ma nhan vien: " + this.maNV);
        System.out.println("Ten nhan vien:" + this.hoTen);
        System.out.println("Luong nhan vien:" + this.luong);
        System.out.println("Thu nhap: " + this.getThuNhap());
        System.out.println("Thue thu nhap: " + this.getThueTN());
    }
}

// Thuộc tính: private
// Phuong thuc: public
