package Solution.Clq_Questions;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class lastIndexOfExample {
    public static void main(String[] args) {
        ArrayList<String>list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("B");
        list.add("D");

        System.out.println(list.lastIndexOf("B"));
    }
}
