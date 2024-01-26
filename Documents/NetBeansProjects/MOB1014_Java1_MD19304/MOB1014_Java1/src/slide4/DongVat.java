package slide4;

public class DongVat {

    String maDV;
    String tenDV;

    public DongVat() {
        maDV = "ph1";
        tenDV = "meo";
    }

    public DongVat(String maDV, String tenDV) {
        this.maDV = maDV;
        this.tenDV = tenDV;
    }

    void xuat() {
        System.out.println(">> Ma DV: " + maDV);
        System.out.println(">> Ten DV: " + tenDV);
    }

    public static void main(String[] args) {
        DongVat dv1 = new DongVat();
        dv1.xuat();
        System.out.println("");
        DongVat dv2 = new DongVat("ph50", "Dog");
        dv2.xuat();
    }
}
