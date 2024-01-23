package ASM;

import java.util.ArrayList;

public class NVService implements INhanvien {

    ArrayList<Nhanvien> list = new ArrayList<>();

    @Override
    public void insert(Nhanvien nv) {
        this.list.add(nv);
    }

    @Override
    public void update(int viTri, Nhanvien nv) {
        this.list.set(viTri, nv);
    }

    @Override
    public void delete(int viTri) {
        this.list.remove(viTri);
    }

    @Override
    public ArrayList<Nhanvien> select() {
        return this.list;
    }

    @Override
    public void setList(ArrayList<Nhanvien> ds) {
        this.list = ds;
    }
}
