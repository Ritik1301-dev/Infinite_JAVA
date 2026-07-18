package Solution.TwoDimensionalArray;
import java.util.Arrays;
import java.util.Scanner;
public class jaggedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter row size : ");
        int n = sc.nextInt();
        int [][]arr = new int[n][];

        for(int i=0;i< arr.length;i++){
            System.out.print("Enter column size of row" + (i+1) + ": ");
            int m = sc.nextInt();
            arr[i] = new int[m];
        }
        System.out.println("Enter Elements :");
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.println("arr["+ i + "]["+ j + "] = ");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("jagged array :");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
