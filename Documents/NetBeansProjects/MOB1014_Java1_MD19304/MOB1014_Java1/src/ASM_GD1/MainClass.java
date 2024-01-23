package ASM_GD1;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        ArrayList<NhanVien> listNV = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int chon;
        do {
            System.out.println("====================RONG VIET====================");
            System.out.printf("|%-50s|\n", "0. Thoat chuong trinh");
            System.out.printf("|%-50s|\n", "1. Nhap danh sach nhan vien");
            System.out.printf("|%-50s|\n", "2. Xuat danh sach nhan vien");
            System.out.printf("|%-50s|\n", "3. Tim va hien thi nhan vien theo ma");
            System.out.printf("|%-50s|\n", "4. Xoa nhan vien theo ma");
            System.out.printf("|%-50s|\n", "5. Cap nhat thong tin nhan vien theo ma");
            System.out.printf("|%-50s|\n", "6. Tim nhan vien theo khoang luong");
            System.out.printf("|%-50s|\n", "7. Sap xep nhan vien theo ho va ten");
            System.out.printf("|%-50s|\n", "8. Sap xep nhan vien theo thu thap");
            System.out.printf("|%-50s|\n", "9. Xuat 5 nhan vien co thu thap cao nhat");
            System.out.printf("|%-50s|\n", "10. May tinh");
            System.out.println("====================END====================");
            System.out.print("Chon chuc nang: ");
            chon = scanner.nextInt();
            switch (chon) {
                case 0:
                    break;
                case 1:
                    System.out.println("1. Nhap danh sach nhan vien");
                    Y1.nhapDanhSachNV(listNV);
                    break;
                case 2:
                    System.out.println("2. Xuat danh sach nhan vien");
                    Y2.xuatDanhSachNV(listNV);
                    break;
                case 3:
                    System.out.println("3. Tim va hien thi nhan vien theo ma");
                    timNVTheoMa(listNV);
                    break;
                case 4:
                    System.out.println("4. Xoa nhan vien theo ma");
                    xoaNVTheoMa(listNV);
                    break;
                case 5:
                    System.out.println("5. Cap nhat thong tin nhan vien theo ma");
                    break;
                case 6:
                    System.out.println("6. Tim nhan vien theo khoang luong");
                    break;
                case 7:
                    System.out.println("7. Sap xep nhan vien theo ho va ten");
                    break;
                case 8:
                    System.out.println("8. Sap xep nhan vien theo thu thap");
                    break;
                case 9:
                    System.out.println("9. Xuat 5 nhan vien co thu thap cao nhat");
                    break;
                case 10:
                    System.out.println("10. May tinh");
                    MayTinh.mt();
                    break;
                default:
                    System.out.println("Chuc nang ban chon khong ton tai! Moi chon lai");
            }
        } while (chon != 0);
    }//end main

//    static void nhapDanhSachNV(ArrayList<NhanVien> listNV) {
//        Scanner scanner = new Scanner(System.in);
//        do {
//            System.out.print("Ma nhan vien: ");
//            String maNV = scanner.nextLine();
//
//            System.out.print("Ten nhan vien: ");
//            String tenNV = scanner.nextLine();
//
//            System.out.print("Luong: ");
//            Double luong = scanner.nextDouble();
//
//            System.out.print("Chuc vu(1. Truong Phong/ 2. Tiep Thi/ 3. Hanh chinh): ");
//            int chucVu = scanner.nextInt();
//
//            if (chucVu == 1) {
//                System.out.print("Tien trach nhiem: ");
//                Double trachNhiem = scanner.nextDouble();
//
//                NhanVien nv = new TruongPhong(maNV, tenNV, luong, trachNhiem);
//                listNV.add(nv);
//            } else if (chucVu == 2) {
//                System.out.print("Tien doanh so: ");
//                Double doanhSo = scanner.nextDouble();
//
//                System.out.print("Tien hoa hong: ");
//                Double hoaHong = scanner.nextDouble();
//
//                NhanVien nv = new TiepThi(maNV, tenNV, luong, doanhSo, hoaHong);
//                listNV.add(nv);
//            } else {
//                NhanVien nv = new NhanVien(maNV, tenNV, luong);
//                listNV.add(nv);
//            }
//
//            System.out.print("Tiep tuc nhap(y/n)? ");
//        } while (!scanner.next().equalsIgnoreCase("n"));
//    }// end Nhap
//    static void xuatDanhSachNV(ArrayList<NhanVien> listNV) {
//        for (NhanVien nv : listNV) {
//            nv.xuat();
//        }
//    }// end Xuat
    static void timNVTheoMa(ArrayList<NhanVien> listNV) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ma nhan vien: ");
        String maNV = scanner.nextLine();
        for (NhanVien nv : listNV) {
            if (nv.getMaNV().equalsIgnoreCase(maNV)) {
                nv.xuat();
            } else {
                System.out.println("Khong ton tai!");
                break;
            }
        }
    }// end Tim

    static void xoaNVTheoMa(ArrayList<NhanVien> listNV) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ma nhan vien: ");
        String maNV = scanner.nextLine();
        boolean kiemTra = false;
        for (NhanVien nv : listNV) {
            if (nv.getMaNV().equalsIgnoreCase(maNV)) {
                listNV.remove(nv);
                System.out.println("Da xoa ma nhan vien " + maNV);
                kiemTra = true;
                break;
            }
        }
        if (!kiemTra) {
            System.out.println("Khong tim thay ma " + maNV);
        }
    }// end Xoa
}
