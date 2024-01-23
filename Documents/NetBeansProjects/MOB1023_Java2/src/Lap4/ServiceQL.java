package Lap4;

import java.util.ArrayList;

public class ServiceQL implements IQuanLy {

    ArrayList<QuanLy> list = new ArrayList<>();

    @Override
    public void insert(QuanLy ql) {
        this.list.add(ql);
    }

    @Override
    public void update(int viTri, QuanLy ql) {
        this.list.set(viTri, ql);
    }

    @Override
    public void delete(int viTri) {
        this.list.remove(viTri);
    }

    @Override
    public ArrayList<QuanLy> select() {
        return this.list;
    }

    @Override
    public void setList(ArrayList<QuanLy> ds) {
        this.list = ds;
    }
}
