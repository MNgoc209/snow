package ASM_GD1;

public class TruongPhong extends NhanVien {

    private Double trachNhiem;

    public TruongPhong() {
    }

    public TruongPhong(Double trachNhiem) {
        this.trachNhiem = trachNhiem;
    }

    public TruongPhong(String maNV, String hoTen, Double luong, Double trachNhiem) {
        super(maNV, hoTen, luong);
        this.trachNhiem = trachNhiem;
    }

    @Override
    public Double getThuNhap() {
        return super.getLuong() + this.trachNhiem;
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Trach nhiem: " + this.trachNhiem);
    }
}
