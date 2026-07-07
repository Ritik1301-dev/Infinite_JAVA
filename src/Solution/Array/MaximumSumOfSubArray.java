package Solution.Array;
import java.util.Scanner;
public class MaximumSumOfSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i=0;i<size;i++){
            System.out.println((i+1) + "th element : ");
             arr[i] = sc.nextInt();
        }
        int currentSum = arr[0];
        int maxSum = arr[0];

        for(int i=1;i<arr.length;i++){
            currentSum = Math.max(arr[i],currentSum + arr[i]);
            maxSum = Math.max(maxSum,currentSum);
        }
        System.out.println(maxSum);
    }
}
