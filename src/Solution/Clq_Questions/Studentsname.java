package Solution.Clq_Questions;

import java.util.ArrayList;

public class Studentsname {
    public static void main(String[] args) {
        ArrayList<String>list = new ArrayList<>();

        list.add("Raj");
        list.add("Sumit");
        list.add("ritik");
        list.add("Ram");
        list.add("Shyam");
        list.removeIf(name->(name.charAt(0)=='S'));
        for(String n:list){
            System.out.println(n);
        }

    }
}
