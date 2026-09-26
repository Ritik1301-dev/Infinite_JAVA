package Solution.hashSet;

import java.util.HashSet;

public class pratice {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(90);
        set.add(87);
        set.add(786);
        set.add(86);
        set.add(10);
        set.add(344);
        set.add(10);
        System.out.println(set);
        set.remove(10);
        System.out.println(set);
        for (int a : set){
            System.out.println(a);
        }
    }
}
