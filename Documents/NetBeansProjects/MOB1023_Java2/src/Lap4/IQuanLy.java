package Lap4;

import java.util.ArrayList;

public interface IQuanLy {
    public void insert(QuanLy ql);
    public void update(int viTri, QuanLy ql);
    public void delete(int viTri);
    public ArrayList<QuanLy> select();
    public void setList(ArrayList<QuanLy> ds);
}
