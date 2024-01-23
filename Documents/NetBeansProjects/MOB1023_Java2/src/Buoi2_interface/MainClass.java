package Buoi2_interface;

public class MainClass {
    
    public static void main(String[] args) {
//        Meo m = new Meo();
//        m.an();
//        m.keu();
//        m.diChuyen();

        Animal m = new Meo();
        Animal d = new Cho();
        Animal c = new Chuot();
        
        nuoi(m);
    }
    
    public static void nuoi(Animal a) {
        a.an();
        a.keu();
        a.diChuyen();
    }
}
