package Solution.SortingAlgorithm;
import java.util.Arrays;
import java.util.Scanner;
public class SelectionSort {
    static void selectionSort(int[] arr,int size){
        for(int i=0;i<size-1;i++){
            int min = i;
            for (int j=i+1;j<size;j++){
            if(arr[j]<arr[min]) min=j;
            }
            if (i != min) {
                int temp = arr[i]; 
                arr[i] = arr[min];
                arr[min] = temp;
            }
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
        selectionSort(arr,size);
    }
}
