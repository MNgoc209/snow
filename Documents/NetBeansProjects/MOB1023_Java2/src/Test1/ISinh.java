package Test1;

import java.util.ArrayList;

public interface ISinh {
    public void insert(Sinh s);
    public void update(int viTri, Sinh s);
    public void delete(int viTri);
    public ArrayList<Sinh> select();
    public void setList(ArrayList<Sinh> ds);
}
