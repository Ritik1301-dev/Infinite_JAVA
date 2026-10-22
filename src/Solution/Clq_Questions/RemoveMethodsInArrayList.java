package Solution.Clq_Questions;

import java.util.ArrayList;

public class RemoveMethodsInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();

        list.add(10);
        list.add(54);
        list.add(55);
        list.add(24);
        list.add(56);

        System.out.println(list);

        list.remove(Integer.valueOf(55));
        System.out.println(list);


        list.clear();
        System.out.println(list.isEmpty());
    }
}
