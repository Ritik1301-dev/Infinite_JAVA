package Solution.Clq_Questions;
import java.util.*;
public class sortArrayList {
    public static void main(String[] args) {
        ArrayList<String>list = new ArrayList<>();
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");

        Collections.sort(list);

        for (String fruit : list){
            System.out.println(fruit);

            ArrayList<Integer>numbers = new ArrayList<>();
            numbers.add(10);
            numbers.add(4);
            numbers.add(2);
            numbers.add(8);

            Collections.sort(numbers);

            for (int sortnum : numbers){
                System.out.println(sortnum);
            }
        }
    }
}
