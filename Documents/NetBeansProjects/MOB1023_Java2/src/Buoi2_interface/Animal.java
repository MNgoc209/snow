package Buoi2_interface;

public interface Animal {

    /*
        * Interface chỉ khai báo hàm, KHÔNG triển khai thân hàm
        * Các class khi thực thi(implement) Interface bắt buộc phải triển khai các phương thức được khai báo trong Interfcae
        * Các class thực thi Interface đối tượng của class đó cũng được có kiểu của Interface: Meo/Cho/Chuot đều là Animal
     */
    public void an();
    public void keu();
    public void diChuyen();
}
