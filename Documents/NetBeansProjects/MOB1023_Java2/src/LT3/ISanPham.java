package LT3;

import java.util.ArrayList;

public interface ISanPham {

    public void insert(SanPham sp);
    public void update(int viTri, SanPham sp);
    public void delete(int viTri);
    public ArrayList<SanPham> select();
    public void setList(ArrayList<SanPham> ds);
}
