package ASM_GD1;

public class TiepThi extends NhanVien {

    private Double doanhSo;
    private Double hoaHong;

    public TiepThi() {
    }

    public TiepThi(Double doanhSo, Double hoaHong) {
        this.doanhSo = doanhSo;
        this.hoaHong = hoaHong;
    }

    public TiepThi(String maNV, String hoTen, Double luong, Double doanhSo, Double hoaHong) {
        super(maNV, hoTen, luong);
        this.doanhSo = doanhSo;
        this.hoaHong = hoaHong;
    }

    @Override
    public Double getThuNhap() {
        return super.getLuong() + this.doanhSo + this.hoaHong;
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Doanh so: " + this.doanhSo);
        System.out.println("Hoa hong: " + this.hoaHong);
    }
}
