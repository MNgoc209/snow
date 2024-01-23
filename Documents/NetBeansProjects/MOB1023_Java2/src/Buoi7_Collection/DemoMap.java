package Buoi7_Collection;

import java.util.HashMap;
import java.util.Map;

public class DemoMap {

    public static void main(String[] args) {
        Map<String, Double> map = new HashMap<>();

        map.put("nokia", 3000.0);
        map.put("oppo", 5000.0);
        map.put("samsung", 9000.0);
        map.put("iPhone", 15000.0);

        System.out.println(map);
        System.out.println(map.get("nokia"));

        map.put("samsung", 9999.0);
        System.out.println(map);
    }
}
