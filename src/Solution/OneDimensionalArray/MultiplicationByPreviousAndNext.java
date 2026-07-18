package Solution.OneDimensionalArray;
import java.util.Scanner;
public class MultiplicationByPreviousAndNext {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i=0;i<arr.length;i++){
            System.out.println((i+1) + "th element");
            arr[i] = sc.nextInt();
        }
        if(size==1){
            System.out.print("Updated Array : ");
            System.out.println(arr[0]);
            return;
        }

        int[] temp = new int[size];
        temp[0] = arr[0]*arr[1];

        for(int i=1;i<size-1;i++){
            temp[i] = arr[i-1]*arr[i+1];
        }

        temp[size-1] = arr[size-2]*arr[size-1];

        System.out.println("Updated Array : ");

        for(int i=0;i<size;i++){
            System.out.println(temp[i] + " ");
        }
    }
}
