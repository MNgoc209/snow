package Buoi12_MultiThreading;

public class MainClass {

    public static void main(String[] args) {
        MyRunnable cv1 = new MyRunnable("Nằm ngủ"),
                cv2 = new MyRunnable("Dọn nhà");

        Thread ngoc = new Thread(cv1),
                duc = new Thread(cv2);

        ngoc.start();
        duc.start();
    }
}
