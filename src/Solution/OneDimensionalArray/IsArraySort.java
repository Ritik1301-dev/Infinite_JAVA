package Solution.OneDimensionalArray;
import java.util.Scanner;
public class IsArraySort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        boolean isSorted = true;
        for(int i=0;i<arr.length;i++){
            System.out.println((i+1) + " th element") ;
            arr[i] = sc.nextInt();
        }

        for (int i=0;i<arr.length-1;i++){
            if(arr[i+1]<arr[i]){
                isSorted = false;
                break;
            }
        }

        System.out.println(isSorted? "Sorted":"not sorted");

    }
}
