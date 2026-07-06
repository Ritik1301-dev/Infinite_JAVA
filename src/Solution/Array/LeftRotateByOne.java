package Solution.Array;
import java.util.Arrays;
import java.util.Scanner;
public class LeftRotateByOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i=0;i<arr.length;i++){
            System.out.println((i+1)+ "th element");
            arr[i] = sc.nextInt();
        }
        int copyFirstIndex = arr[0];
        for (int i=0;i<arr.length-1;i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = copyFirstIndex;
        System.out.println("Left Rotation of the array ");
        System.out.println(Arrays.toString(arr));

    }
}
