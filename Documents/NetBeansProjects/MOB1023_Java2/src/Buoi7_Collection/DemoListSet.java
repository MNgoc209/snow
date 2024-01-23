package Buoi7_Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DemoListSet {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(3);
        list.add(4);

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(2);
        set.add(3);
        set.add(4);

        System.out.println("---List---");
        System.out.println(list);
        System.out.println("---Set---");
        System.out.println(set);

        list.addAll(set);
        set.addAll(list);
        System.out.println("------list.addAll()------");
        System.out.println(list);
        System.out.println("------set.addAll()------");
        System.out.println(set);

        Collections.shuffle(list);
        System.out.println("------list.shuffle()------");
        System.out.println(list);
        Collections.sort(list);
        System.out.println("------list.sort()------");
        System.out.println(list);
        Collections.reverse(list);
        System.out.println("------list.reverse()------");
        System.out.println(list);
    }
}
