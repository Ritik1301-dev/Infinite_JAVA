package Solution.OneDimensionalArray;

import java.util.Arrays;
import java.util.Scanner;

public class Clg_Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size Of array : ");
        int Size = sc.nextInt();
        int[] arr = new int[Size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter " + (i + 1) + "th element");
            arr[i] = sc.nextInt();
        }
        int [] arr2 = new int[Size];
        for(int i=0;i<arr.length;i++){
          int temp  = arr[i];
            arr[i] = arr2[i];
            arr2[i] = temp;
        }
        System.out.println(Arrays.toString(arr2));
    }
}
