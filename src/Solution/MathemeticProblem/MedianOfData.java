
package Solution.MathemeticProblem;

import java.util.Scanner;
import java.util.Arrays;

public class MedianOfData {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter element " + (i + 1) + ":");
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int mid = size / 2;

        if (size % 2 != 0) {
            // Odd size
            System.out.println("Median: " + arr[mid]);
        } else {
            // Even size
            double median = (arr[mid - 1] + (double) arr[mid]) / 2;
            System.out.println("Median: " + median);
        }

        sc.close();
    }
}
