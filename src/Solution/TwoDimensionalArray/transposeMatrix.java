package Solution.TwoDimensionalArray;
import java.util.Scanner;
public class transposeMatrix {
    static int [][] transpose(int [][] arr) {
        int mat[][] = new int[arr[0].length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                mat[j][i] = arr[i][j];
            }
        }
        return mat;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of row : ");
        int n = sc.nextInt();
        System.out.print("Enter the Size Of column : ");
        int m = sc.nextInt();

        int[][] arr = new int[n][m];
        System.out.println("Enter elements of array");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int[][] newArray = transpose(arr);
        System.out.println("Transpose matrix : ");
       for (int i=0;i<newArray.length;i++){
           for (int j=0;j<newArray[i].length;j++){
               System.out.print(newArray[i][j] + " ");
           }
           System.out.println();
       }
    }
}
