package Solution.OneDimensionalArray;

import java.util.Arrays;
import java.util.Scanner;
public class TypesToPrintArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i< arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for (int temp : arr){
            System.out.print(temp + " ");
        }
        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
        System.out.print(Arrays.toString(arr));  // For this method we need to import the Arrays package.
    }
}
