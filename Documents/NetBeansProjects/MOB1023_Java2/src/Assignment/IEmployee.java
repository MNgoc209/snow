package Assignment;

import java.util.ArrayList;

public interface IEmployee {
    public void insert(Employee e);
    public void update(int viTri, Employee e);
    public void delete(int viTri);
    public ArrayList<Employee> select();
}
