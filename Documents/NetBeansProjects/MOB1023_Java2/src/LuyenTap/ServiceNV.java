package LuyenTap;

import java.util.ArrayList;

public class ServiceNV implements INhanVien {

    ArrayList<NhanVien> list = new ArrayList<>();

    @Override
    public void insert(NhanVien nv) {
        list.add(nv);
    }

    @Override
    public void update(int viTri, NhanVien nv) {
        list.set(viTri, nv);
    }

    @Override
    public void delete(int viTri) {
        list.remove(viTri);
    }

    @Override
    public ArrayList<NhanVien> select() {
        return list;
    }

    @Override
    public void setList(ArrayList<NhanVien> ds) {
        list = ds;
    }

}
