package Solution.Clq_Questions;
import java.util.*;
public class arrayList {
    public static void main(String[] args) {
        ArrayList<String>list = new ArrayList<>();
        list.add("Ravi");
        list.add("Kisan");
        list.add("Mahi");
        list.add("Ayush");
        list.add("Vaibhav");

        Iterator itr = list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
