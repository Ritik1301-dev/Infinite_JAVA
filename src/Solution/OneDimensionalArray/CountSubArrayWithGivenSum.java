package Solution.OneDimensionalArray;
import java.util.Scanner;
public class CountSubArrayWithGivenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter target value : ");
        int target = sc.nextInt();
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i=0;i<arr.length;i++){
            System.out.println((i+1) + "th element");
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum += arr[j];
                if(sum==target){
                    count++;
                }
            }
        }
        System.out.print( "the maximum subarray is :  " +count);
    }
}
