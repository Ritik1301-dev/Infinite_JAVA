
package Solution.Clq_Questions;

import java.util.ArrayList;

public class RetainAllMethod {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Java");
        list2.add("C");

        System.out.println(list.retainAll(list2));
        System.out.println(list);
    }
}

