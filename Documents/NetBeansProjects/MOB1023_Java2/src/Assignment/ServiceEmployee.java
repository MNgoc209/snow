package Assignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ServiceEmployee {

    public Employee searchByMa(ArrayList<Employee> list, String maNV) {
        for (Employee e : list) {
            if (maNV.equalsIgnoreCase(e.getMaNV())) {
                return e;
            }
        }
        return null;
    }

    public void ghiFile(ArrayList<Employee> list) throws FileNotFoundException, IOException {
        File file = new File("dataObject.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        for (Employee e : list) {
            oos.writeObject(e);
        }
        fos.close();
        oos.close();
    }

    public ArrayList<Employee> docFile(ArrayList<Employee> list) throws FileNotFoundException, IOException, ClassNotFoundException {
        File file = new File("dataObject.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);

        Employee e = new Employee();
        while (fis.available() > 0) {
            e = (Employee) ois.readObject();
            list.add(e);
        }
        fis.close();
        ois.close();
        return list;
    }
}
