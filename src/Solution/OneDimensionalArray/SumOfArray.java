package Solution.OneDimensionalArray;
import java.util.Scanner;
public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        int size = sc.nextInt();
        int sum = 0;
        int[] arr = new int[size];
        for (int i=0;i<arr.length;i++){
            System.out.println(i+1 + "th element");
            arr[i] = sc.nextInt();
             sum +=arr[i];
        }
        System.out.print("Sum :  "+ sum);

    }
}
