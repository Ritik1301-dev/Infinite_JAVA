package Solution.hashSet;

import java.util.HashSet;

public class PrintOnlyUniqueNumber {
    public static void main(String[] args) {
        int arr[] ={2,1,1,4,2,4,4,3,4,5,3};
        HashSet<Integer>set = new HashSet<>();
        for (int i=0;i<arr.length;i++){
            if(set.contains(arr[i])) set.remove(arr[i]);
            else set.add(arr[i]);
        }
        System.out.println(set);
    }
}
