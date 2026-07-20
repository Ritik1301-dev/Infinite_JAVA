package Solution.TwoDimensionalArray;
import java.util.Scanner;
public class diagonalSum {
    static int diagonalSum(int [][] mat){
        int sum = 0;
        for(int i=0;i<mat.length;i++){
            for (int j=0;j<mat[i].length;j++){
                if(i==j || i+j == mat.length-1) sum += mat[i][j];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size Of row : ");
        int n = sc.nextInt();
        System.out.print("Enter the Size Of column : ");
        int m = sc.nextInt();

        int [][]arr = new int[n][m];
        System.out.println("Enter elements of array");
        for (int i=0;i< arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int Sum = diagonalSum.diagonalSum(arr);
        System.out.print("The Sum of the diagonal is : ");
        System.out.println(Sum);
    }
}
