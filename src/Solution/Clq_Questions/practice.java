package Solution.Clq_Questions;

import java.util.HashSet;
import java.util.Set;

public class practice {
   /* public static void main(String[] args) {

        int [] arr = {1,2,3,1};
        System.out.println(hasDuplicate(arr));
    }

    public static boolean  hasDuplicate(int [] arr) {
        Set<Integer>set = new HashSet<>();
        for (int num : arr){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }

    */

    public static void main(String[] args) {
        String s = "java is easy and java is powerful";

        String[] words = s.split(" ");

        HashSet<String> set = new HashSet<>();

        for (String word : words) {
            set.add(word);
        }

        System.out.println(set.size());
    }
}
