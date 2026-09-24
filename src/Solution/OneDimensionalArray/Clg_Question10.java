package Solution.OneDimensionalArray;

import java.util.Arrays;
import java.util.Scanner;

public class Clg_Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of first array : ");
        int size = sc.nextInt();
        int[] arr1 = new int[size];
        for (int i=0;i<arr1.length;i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the size of second array : ");
        int size2 = sc.nextInt();
        int[] arr2 = new int[size2];
        for (int i=0;i<arr2.length;i++){
            arr2[i] = sc.nextInt();
        }
        int [] ans = new int [arr1.length + arr2.length];
        for(int i=0;i<arr1.length;i++){
            ans[i] = arr1[i];
        }

    }
}
