package Solution.Clq_Questions;

import java.util.ArrayList;

public class DivisibleBy3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        list.removeIf(n-> (n%3 == 0));
        for (int i : list){
            System.out.println(i);
        }

    }
}
