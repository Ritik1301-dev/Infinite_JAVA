package Solution.TwoDimensionalArray;
import java.util.Scanner;
public class Pratice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of row : ");
        int n = sc.nextInt();
        System.out.print("Enter the size of column :");
        int m = sc.nextInt();

        int [][]arr = new int[n][m];
        for (int i=0;i< arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.println("Enter element at row " + i+ " and column "+j +": ");
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i=0;i< arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
