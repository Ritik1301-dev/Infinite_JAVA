package Solution.OneDimensionalArray;
import java.util.Arrays;
import java.util.Scanner;
public class ReverseArrayUsingTwoPointer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the size : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i=0;i<size;i++){
            System.out.print((i+1) + "th element : ");
            arr[i] = sc.nextInt();
        }
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.print("Reversed Array : ");
        System.out.println(Arrays.toString(arr));
    }
}
