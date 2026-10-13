package Solution.Recursion;
import java.util.Arrays;
import java.util.Scanner;
public class reverseInArray {
    static void rev(int [] arr , int i ,int j){
        if(i>=j)  return;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
         rev(arr , i+1 , j-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array size : ");
        int size = sc.nextInt();
        int []arr = new int[size];
        for (int i=0;i<arr.length;i++){
            System.out.println("Enter " + (i+1) + "th element");
            arr[i] = sc.nextInt();
        }
        rev(arr , 0 , arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
