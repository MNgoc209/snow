package Lap3;

import java.util.ArrayList;

public interface IStudent {

    public void insert(Student s);
    public void update(int viTri, Student s);
    public void delete(int viTri);
    public ArrayList<Student> select();
}
