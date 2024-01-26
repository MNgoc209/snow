package Lab1;

import java.util.Scanner;

public class Bai1 {

    public static void main(String[] args) {
        String hoTen;
        double diemTrungBinh;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ho va ten: ");
        hoTen = scanner.nextLine();
        System.out.print("Diem trung binh: ");
        diemTrungBinh = scanner.nextDouble();
        System.out.printf("<<%s: %.3f diem>>", hoTen, diemTrungBinh);
    }
    
/*    
System.out.print(): xuất xong không xuống dòng
System.out.println(): xuất xong có xuống dòng
System.out.printf(): xuất có định dạng, các ký tự định dạng
%d: số nguyên
%f: số thực(mặc định là 6 số, %.3f định dạng 3 số)
%s: chuỗi
*/
}
