package ASM_GD1;

import java.util.ArrayList;
import java.util.Scanner;

public class Y1 {

    static void nhapDanhSachNV(ArrayList<NhanVien> listNV) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Ma nhan vien: ");
            String maNV = scanner.next();

            System.out.print("Ten nhan vien: ");
            String tenNV = scanner.next();

            System.out.print("Luong: ");
            Double luong = scanner.nextDouble();

            System.out.print("Chuc vu(1. Truong Phong/ 2. Tiep Thi/ 3. Hanh chinh): ");
            int chucVu = scanner.nextInt();

            if (chucVu == 1) {
                System.out.print("Tien trach nhiem: ");
                Double trachNhiem = scanner.nextDouble();

                NhanVien nv = new TruongPhong(maNV, tenNV, luong, trachNhiem);
                listNV.add(nv);
            } else if (chucVu == 2) {
                System.out.print("Tien doanh so: ");
                Double doanhSo = scanner.nextDouble();

                System.out.print("Tien hoa hong: ");
                Double hoaHong = scanner.nextDouble();

                NhanVien nv = new TiepThi(maNV, tenNV, luong, doanhSo, hoaHong);
                listNV.add(nv);
            } else {
                NhanVien nv = new NhanVien(maNV, tenNV, luong);
                listNV.add(nv);
            }
            System.out.print("Tiep tuc nhap khong ban oi(y/n)? ");
        } while (!scanner.next().equalsIgnoreCase("n"));
    }// end Nhap
}
