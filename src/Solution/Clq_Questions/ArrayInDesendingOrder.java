package Solution.Clq_Questions;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
public class ArrayInDesendingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print((i + 1) + "th element: ");
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i] + " ");
        }
    }
}
