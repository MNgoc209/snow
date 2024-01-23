package Buoi9_Exception;

public class DemoException {

    public static void main(String[] args) {
        String[] list = {"19", "20", "Minh Ngọc", null, "22"};
        for (int i = 0; i <= 10; i++) {
            try {
                String s = list[i];
                int tuoi = toInt(s);
                System.out.println(tuoi);
                System.out.println("Ép kiểu thành công");
            } catch (NumberFormatException e) {
                System.out.println("Không phải là số");
                e.printStackTrace();
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Vượt quá phạm vi mảng");
                e.printStackTrace();
            } catch (Exception e) {
                System.out.println("Có lỗi xảy ra");
                e.printStackTrace();
            } finally {
                System.out.println("----------");
            }
        }
        System.out.println("Kết thúc xử lý");
    }

    public static int toInt(String s) throws Exception {
        try {
            int i = Integer.parseInt(s);
            return i;
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
}
