package ASM;

import java.util.ArrayList;

public interface INhanvien {

    public void insert(Nhanvien nv);
    public void update(int viTri, Nhanvien nv);
    public void delete(int viTri);
    public ArrayList<Nhanvien> select();
    public void setList(ArrayList<Nhanvien> ds);
}
