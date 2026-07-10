package Solution.SearchingAlgorithm;
import java.util.Scanner;
public class LinearSearch {
           static int linearSearch(int []arr, int target){
               for (int i=0;i<arr.length;i++){
                   if (arr[i]==target) return i;
               }
               return -1;
           }
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();

           int [] arr = new int[size];
           for (int i=0;i<size;i++){
               System.out.print("Enter "+ (i+1) + "th element : ");
               arr[i] = sc.nextInt();
           }
        System.out.print("Enter the target value : ");
           int target = sc.nextInt();
           int index = linearSearch(arr,target);
           if(index == -1) System.out.println("Target Not Found");
           else System.out.println("Target Found at " + index +  "th index" );
    }
}
