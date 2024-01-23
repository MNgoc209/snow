package Test1;

import java.util.ArrayList;

public class Service implements ISinh {

    ArrayList<Sinh> list = new ArrayList<>();

//    @Override
    public void insert(Sinh s) {
        list.add(s);
    }

//    @Override
    public void update(int viTri, Sinh s) {
        list.set(viTri, s);
    }

//    @Override
    public void delete(int viTri) {
        list.remove(viTri);
    }

//    @Override
    public ArrayList<Sinh> select() {
        return list;
    }

//    @Override
    public void setList(ArrayList<Sinh> ds) {
        list = ds;
    }

}
