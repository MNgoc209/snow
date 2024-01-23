package Buoi1_oop;

public class SinhVien extends Nguoi {

    /*
        * SinhVien được thừa hưởng toàn bộ thuộc tính và phương thức của Nguoi
        * SinhVien chỉ được phép truy cập thuộc tính và phương thức KHÔNG PRIVATE của Nguoi
        * Đối tượng của SinhVien được phép có kiểu Nguoi
     */
    
    /*
        * @Override: ghi đè
        * Class con có phương thức cùng tên, cùng tham số
        * (giống với phương thức của class cha)
    */
    @Override
    public void xuatThongTin() {
        System.out.println("Cúc cu");
        super.xuatThongTin();
    }
}
