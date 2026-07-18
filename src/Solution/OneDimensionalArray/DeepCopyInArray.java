package Solution.OneDimensionalArray;
import java.util.Arrays;
import java.util.Scanner;
public class DeepCopyInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int[] temp = new int[arr.length];
        for (int i=0;i<arr.length;i++){
            temp[i] = arr[i];
        }
        temp[3] = 1000;
        System.out.println(Arrays.toString(temp));
        System.out.println(Arrays.toString(arr));
    }
}
