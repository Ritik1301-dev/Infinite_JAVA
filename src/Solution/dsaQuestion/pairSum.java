package Solution.dsaQuestion;
import java.util.*;
public class pairSum {
    public static int[] pairSum(int[]arr,int target){
        int p = 0;
        int q = arr.length-1;
        while(p<q){
            int sum = arr[p]+arr[q];
            if(sum == target){
                return new int[]{p,q};
            }else if (sum < target){
                p++;
            }else {
                q--;
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print((i + 1) + "th element : ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target value : ");
        int target = sc.nextInt();
        int[] ans = pairSum(arr, target);
        System.out.print("Answer : ");
        System.out.println(ans[0] + " " + ans[1]);
    }
}
