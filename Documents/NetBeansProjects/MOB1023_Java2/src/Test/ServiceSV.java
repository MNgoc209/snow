package Test;

import java.util.ArrayList;

public class ServiceSV implements ISV {

    ArrayList<SV> list = new ArrayList<>();

    @Override
    public void insert(SV sv) {
        list.add(sv);
    }

    @Override
    public void update(int viTri, SV sv) {
        list.set(viTri, sv);
    }

    @Override
    public void delete(int viTri) {
        list.remove(viTri);
    }

    @Override
    public ArrayList<SV> select() {
        return list;
    }

    @Override
    public void setList(ArrayList<SV> ds) {
        list = ds;
    }

}
