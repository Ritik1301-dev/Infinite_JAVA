package Solution.OneDimensionalArray;

import java.util.Scanner;

public class Clg_Question5 {
    public static void main(String[] args) {
        int [] arr = {5,2,9,2,7,2};
        int key = 2;
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(key==arr[i]){
                count++;
            }
        }
        System.out.println( "Occurrences of  " + key + " = " +  count);
    }
}
