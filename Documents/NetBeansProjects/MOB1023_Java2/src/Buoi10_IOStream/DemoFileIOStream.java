package Buoi10_IOStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DemoFileIOStream {

    public static void main(String[] args) {
        String filename = "demo_file_io.txt";

        System.out.println("Bắt đầu đọc file");
        docFile(filename);
        System.out.println("Kết thúc đọc file");
        System.out.println("");
        System.out.println("Bắt đầu đọc file");
        ghiFile(filename);
        System.out.println("Kết thúc đọc file");
    }

    public static void docFile(String filename) {
        File f = new File(filename);
        // Kiểm tra File tồn tại trước khi xử lý
        if (f.exists() == false) {
            System.out.println("File không tồn tại");
            return;
        }

        try {
            // Mở luồng để đọc file
            FileInputStream fis = new FileInputStream(f);
            while (true) {
                int i = fis.read();
                if (i == -1) {
                    System.out.println("Cuối file");
                    break;
                }
                System.out.print((char) i);
            }
            fis.close();
        } catch (FileNotFoundException e) {
            System.out.println("File không tồn tại");
            e.printStackTrace();
            return;
        } catch (IOException e) {
            System.out.println("Lỗi luồng đọc");
            e.printStackTrace();
            return;
        }
    }

    public static void ghiFile(String filename) {
        File f = new File(filename);
        // Kiểm tra File tồn tại trước khi xử lý
        if (f.exists() == false) {
            System.out.println("File không tồn tại");
            return;
        }
        try {
            FileOutputStream fos = new FileOutputStream(f);
            String txt = "Hello CP18201";
            byte[] b = txt.getBytes();
            fos.write(b);
            fos.close();
        } catch (FileNotFoundException e) {
            System.out.println("File không tồn tại");
            e.printStackTrace();
            return;
        } catch (IOException e) {
            System.out.println("Lỗi luồng ghi");
            e.printStackTrace();
            return;
        }
    }
}
