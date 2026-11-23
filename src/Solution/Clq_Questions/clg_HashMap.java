package Solution.Clq_Questions;

import java.util.HashMap;
import java.util.Map;

public class clg_HashMap {

    //
    public static void main(String[] args) {
        Map<Integer, String>map =new  HashMap<Integer, String>();

        map.put(100 , "Amit");
        map.put(101 , "Namit");
        map.put(102 , "kit");
        map.put(103 , "Lalit");

        for (Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" " + m.getValue());
        }
    }
}
