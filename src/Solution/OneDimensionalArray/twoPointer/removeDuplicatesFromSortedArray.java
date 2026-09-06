package Solution.OneDimensionalArray.twoPointer;
import java.util.*;
public class removeDuplicatesFromSortedArray {
    static int removeDuplicate(int []arr){
        int k = 1;
        for(int i=1;i<arr.length;i++){
            if(arr[i] != arr[i-1]){
                arr[k] = arr[i];
                k++;
            }
        }
        return k;
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
        int ans  = removeDuplicate(arr);
        System.out.println(ans);
    }
}
