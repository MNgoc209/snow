package LuyenTap;

import java.util.ArrayList;

public interface INhanVien {
    public void insert(NhanVien nv);
    public void update(int viTri, NhanVien nv);
    public void delete(int viTri);
    public ArrayList<NhanVien> select();
    public void setList(ArrayList<NhanVien> ds);
}
