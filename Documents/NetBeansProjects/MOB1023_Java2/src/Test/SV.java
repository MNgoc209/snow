package Test;

import java.io.Serializable;

public class SV implements Serializable {

    private String hoTen;
    private String ngaySinh;
    private String gioiTinh;
    private String chuyenNganh;
    private boolean hocLai;

    public SV() {
    }

    public SV(String hoTen, String ngaySinh, String gioiTinh, String chuyenNganh, boolean hocLai) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.chuyenNganh = chuyenNganh;
        this.hocLai = hocLai;
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

    public boolean isHocLai() {
        return hocLai;
    }

    public void setHocLai(boolean hocLai) {
        this.hocLai = hocLai;
    }

}
