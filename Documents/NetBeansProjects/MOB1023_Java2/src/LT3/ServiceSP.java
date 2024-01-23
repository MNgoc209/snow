package LT3;

import java.util.ArrayList;

public class ServiceSP implements ISanPham {

    ArrayList<SanPham> list = new ArrayList<>();

    @Override
    public void insert(SanPham sp) {
        list.add(sp);
    }

    @Override
    public void update(int viTri, SanPham sp) {
        list.set(viTri, sp);
    }

    @Override
    public void delete(int viTri) {
        list.remove(viTri);
    }

    @Override
    public ArrayList<SanPham> select() {
        return list;
    }

    @Override
    public void setList(ArrayList<SanPham> ds) {
        list = ds;
    }

}
