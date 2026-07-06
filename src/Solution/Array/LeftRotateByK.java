package Solution.Array;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRotateByK {
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

        System.out.print("Enter how many times rotate by left: ");
        int k = sc.nextInt();

        // To avoid unnecessary rotations
        k = k % arr.length;

        // Rotate k times
        for (int j = 1; j <= k; j++) {

            int copyFirstIndex = arr[0];

            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }

            arr[arr.length - 1] = copyFirstIndex;
        }

        System.out.println("Left Rotation of the array:");
        System.out.println(Arrays.toString(arr));
    }
}