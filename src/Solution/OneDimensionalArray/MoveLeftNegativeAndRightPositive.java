package Solution.OneDimensionalArray;
import java.util.Arrays;
import  java.util.Scanner;
public class MoveLeftNegativeAndRightPositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i=0;i<arr.length;i++){
            System.out.println((i+1) + "th element");
            arr[i] = sc.nextInt();
        }
        int i =0;
        int j =0;
        while (i< arr.length) {
            if (arr[i]< 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
            i++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
