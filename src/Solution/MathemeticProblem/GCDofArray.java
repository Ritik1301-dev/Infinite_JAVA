package Solution.MathemeticProblem;
import java.util.Scanner;
public class GCDofArray {
    static int GCD( int a , int b){
        if(b==0) return a;
        return GCD(b , b%a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i=0;i<arr.length;i++){
            System.out.println((i+1) + "th element");
            arr[i] = sc.nextInt();
        }
        int ans = arr[0];
        for (int i=0;i<arr.length;i++){
            ans = GCD(ans , arr[i]);
        }
        System.out.println(ans);
    }
}
