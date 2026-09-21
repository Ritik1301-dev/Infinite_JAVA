package Solution.OneDimensionalArray;

import java.util.Scanner;

public class Clg_Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size Of array : ");
        int Size = sc.nextInt();
        int[] arr = new int[Size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter " + (i + 1) + "th element");
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min =arr[0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[i] < max ) {
                    min = Math.min(arr[i] , min);
                } else {
                    max = arr[i] ;
                }
            }
        }
        System.out.println("Max : " + max);
        System.out.println( " Min : " + min);
    }
}
