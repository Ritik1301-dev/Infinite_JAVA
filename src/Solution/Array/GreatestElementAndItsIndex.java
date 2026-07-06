package Solution.Array;
import java.util.Scanner;
public class GreatestElementAndItsIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++){
        arr[i] = sc.nextInt();
    }
        int max = arr[0];
        int index = 0;

    for (int i=1;i<arr.length;i++){
        if(arr[i]>max){
            max = arr[i];
            index = i;
        }
    }

        System.out.println(max + " Max element found at "+ (index) + " index");


}

}
