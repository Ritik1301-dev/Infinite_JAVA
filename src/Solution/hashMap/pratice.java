package Solution.hashMap;

import java.util.HashMap;
import java.util.Map;

public class pratice {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
           map.put(1,"Ritik Kose");
           map.put(2,"Raj Rohit");
           map.put(3,"Vaibhav Bhadoriya");
        System.out.println(map);
        for (int key : map.keySet()){
            System.out.println(key);
        }
        for (String value : map.values() ){
            System.out.println(value);
        }
        for (Map.Entry<Integer,String>pair : map.entrySet()){
            System.out.println(pair.getKey() + "-> " + pair.getValue());
        }
    }
}
