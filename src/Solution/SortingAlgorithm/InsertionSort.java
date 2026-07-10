package Solution.SortingAlgorithm;
import java.util.Arrays;
import java.util.Scanner;
public class InsertionSort {
    static void insertionSort(int[]arr,int size){
        for (int i=1;i<size;i++){
            int key = arr[i] ,j = i-1;
            while (j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i=0;i<arr.length;i++){
            System.out.print((i+1)+ "th element : " );
            arr[i] = sc.nextInt();
        }
        insertionSort(arr,size);
    }
}
