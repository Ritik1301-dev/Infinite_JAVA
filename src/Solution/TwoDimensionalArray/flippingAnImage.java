package Solution.TwoDimensionalArray;
import java.util.Scanner;
public class flippingAnImage {
    static int[][]  flipping(int [][] image){
        for(int i=0;i< image.length;i++){
            int p=0,q=image[i].length-1;
            while (p<q){
                int temp = image[i][p];
                image[i][p] = image[i][q];
                image[i][q] = temp;
                p++;q--;
            }
        }
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image[i].length;j++){
                image[i][j] = image[i][j]==1? 0:1;
            }
        }
        return image;
    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of row : ");
        int n = sc.nextInt();
        System.out.println("Enter the Size of column : ");
        int m = sc.nextInt();

        int[][] arr = new int[n][m];
        System.out.println("Enter elements : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int[][] FlippingArray = flipping(arr);
        System.out.println("Flipping An Image : ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(FlippingArray[i][j] + " ");
            }
            System.out.println();
        }

    }
}
