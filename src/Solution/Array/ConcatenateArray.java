package Solution.Array;
import java.util.Scanner;
public class ConcatenateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i=0;i<arr.length;i++){
            System.out.println((i+1) + "th element");
            arr[i] = sc.nextInt();
        }
        int[] ans = new int[2*size];

        for(int i=0;i<size;i++){
            ans[i] = arr[i];
            ans[i+size] = arr[i];
        }
        System.out.print("Concatenate Array : ");
        for(int i=0;i<2*size;i++){
            System.out.print(ans[i] + " ");
        }
    }
}
