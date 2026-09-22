package Solution.OneDimensionalArray;

import java.util.Arrays;

public class Clg_Question6 {
    public static void main(String[] args) {
        int [] arr = {5,2,9,2,7,2};
        int oldVal = 2;
        int newVal = 100;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == oldVal){
                arr[i] = newVal;
            }
        }
        System.out.println( "New Array :  "  + Arrays.toString(arr));
    }
}
