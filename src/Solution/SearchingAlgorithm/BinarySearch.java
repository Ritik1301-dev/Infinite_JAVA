package Solution.SearchingAlgorithm;
import java.util.Scanner;
public class BinarySearch {
    static int binarySearch(int[] arr,int target){
        int first = 0, last = arr.length-1;
        while (first <= last){
            int mid =first + (last-first)/2;
            if(arr[mid] == target) return mid;
            else if (arr[mid] > target)  last = mid-1;
            else first = mid+1;
        }
        return -1;
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
        System.out.print("Enter the target : ");
        int target = sc.nextInt();

        int index = binarySearch(arr,target);
        if(index == -1) System.out.println("Target not found ");
        else System.out.println("Target found in " + index + "th index");
    }
}
