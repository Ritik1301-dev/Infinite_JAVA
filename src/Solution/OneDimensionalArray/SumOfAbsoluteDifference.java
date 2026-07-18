package Solution.OneDimensionalArray;
import java.util.Scanner;
public class SumOfAbsoluteDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i=0;i<arr.length;i++){
            System.out.println((i+1) + "th element");
            arr[i] = sc.nextInt();
        }
        long sum = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                sum += Math.abs(arr[i] - arr[j]);
            }
        }
        System.out.print( "The sum of Absolute diffence is : " + sum);
    }
}
