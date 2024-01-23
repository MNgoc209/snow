package Test;

import java.util.ArrayList;

public interface ISV {
    public void insert(SV sv);
    public void update(int viTri, SV sv);
    public void delete(int viTri);
    public ArrayList<SV> select();
    public void setList(ArrayList<SV>ds);
}
