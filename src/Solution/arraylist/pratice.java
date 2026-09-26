package Solution.arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class pratice {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(210);
        list.add(23550);
        list.add(232223);
        list.add(321);
        list.add(21321);
        System.out.println(list);
        System.out.println(list.get(3));
        list.add(3,600);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        list.remove(Integer.valueOf(23550));
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.contains(600));
        list.set(3,9000);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        list.clear();
        System.out.println(list);
    }
}
