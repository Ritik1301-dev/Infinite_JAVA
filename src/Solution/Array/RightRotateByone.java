package Solution.Array;
import java.util.Arrays;
import java.util.Scanner;
public class RightRotateByone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i=0;i<arr.length;i++){
            System.out.println((i+1)+ "th element");
            arr[i] = sc.nextInt();
        }
        int copyLastIndex = arr[arr.length-1];
        for (int i=arr.length-1;i>0;i--){
            arr[i] = arr[i-1];
        }
        arr[0] = copyLastIndex;
        System.out.println("Right Rotation of the array  ");
        System.out.println(Arrays.toString(arr));
    }
}
