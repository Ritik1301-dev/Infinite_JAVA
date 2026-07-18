package Solution.OneDimensionalArray;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseCopyOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int[] temp = new int[arr.length];
        int i = arr.length-1;
        for (int j=0;j<temp.length;j++){
            temp[j] = arr[i];
            i--;
        }
        System.out.println(Arrays.toString(temp));
    }
}
