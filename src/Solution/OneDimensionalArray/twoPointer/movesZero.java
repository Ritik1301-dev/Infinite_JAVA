package Solution.OneDimensionalArray.twoPointer;
import java.util.*;
public class movesZero {
    static int[] movesZero(int[] arr){
        int k =0;
        for (int i=0;i< arr.length;i++){
            if(arr[i] != 0){
                arr[k] = arr[i];
                k++;
            }
        }
        while (k<arr.length){
            arr[k] =0;
            k++;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        for(int i=0;i<arr.length;i++) {
            System.out.print((i + 1) + "th element : ");
            arr[i] = sc.nextInt();
        }
        int[] ans  = movesZero(arr);
        System.out.println(Arrays.toString(ans));
    }
}
