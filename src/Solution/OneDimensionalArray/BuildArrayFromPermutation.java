package Solution.OneDimensionalArray;
import java.util.Arrays;
import java.util.Scanner;
public class BuildArrayFromPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i=0;i<arr.length;i++){
            System.out.println((i+1) + "th element");
            arr[i] = sc.nextInt();
        }
        int[] ans = new int[size];
        for(int i=0;i<arr.length;i++){
            ans[i] = arr[arr[i]];
        }
        System.out.println(Arrays.toString(ans));
    }
}
