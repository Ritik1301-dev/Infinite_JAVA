package Solution.OneDimensionalArray.twoPointer;
import java.util.*;
public class twoSum {
    static int[] twoSum (int []arr, int target ){
     int i = 0, j=arr.length-1;
     while(i<j){
         int sum = arr[i]+arr[j];
         if(sum == target){
             return new int[]{i+1,j+1};
        } else if (sum>target){
             j--;
         }else {
             i++;
         }
     }
     return new int[]{};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        for(int i=0;i<arr.length;i++){
            System.out.print((i+1)+"th element : ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target value : ");
        int target = sc.nextInt();
        int[] index = twoSum(arr,target);
        System.out.println(Arrays.toString(index));
    }
}
