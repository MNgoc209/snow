package Buoi10_IOStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DemoObjectIOStream {

    public static void main(String[] args) {
        String filename = "demo_object_io.txt";
        System.out.println("Bắt đầu ghi file");
        ghiFile(filename);
        System.out.println("Kết thúc ghi file");
        System.out.println("");
        System.out.println("Bắt đầu đọc file");
        docFile(filename);
        System.out.println("Kết thúc đọc file");

    }

    public static void docFile(String filename) {
        File f = new File(filename);
        // Kiểm tra file tồn tại trước khi xử lý
        if (f.exists() == false) {
            System.out.println("File không tồn tại");
            return;
        }

        try {
            // Mở luồng để đọc file
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList<Integer> ds = (ArrayList<Integer>) ois.readObject();

            for (Integer i : ds) {
                System.out.println(i);
            }
            ois.close();
        } catch (FileNotFoundException e) {
            System.out.println("File không tồn tại");
            e.printStackTrace();
            return;
        } catch (IOException e) {
            System.out.println("Lỗi luồng đọc");
            e.printStackTrace();
            return;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DemoObjectIOStream.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void ghiFile(String filename) {
        File f = new File(filename);
        // Kiểm tra file tồn tại trước khi xử lý
        if (f.exists() == false) {
            System.out.println("File không tồn tại");
            return;
        }

        ArrayList<Integer> ds = new ArrayList<>();
        ds.add(1);
        ds.add(4);
        ds.add(2);

        try {
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(ds);
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
