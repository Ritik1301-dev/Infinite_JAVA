package Solution.Array;
import java.util.Arrays;
import java.util.Scanner;
public class ShallowCopyInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int[] temp = arr;

        temp[2] = 110;
        System.out.println(Arrays.toString(temp));
        System.out.println(Arrays.toString(arr));
    }
}
