package Lap3;

import java.util.ArrayList;

public class SeviceSV implements IStudent {

    ArrayList<Student> list = new ArrayList<>();

    @Override
    public void insert(Student s) {
        list.add(s);
    }

    @Override
    public void update(int viTri, Student s) {
        this.list.set(viTri, s);
    }

    @Override
    public void delete(int viTri) {
        this.list.remove(viTri);
    }

    @Override
    public ArrayList<Student> select() {
        return this.list;
    }
}
