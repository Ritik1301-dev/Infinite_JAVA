package Solution.Array;
import java.util.Scanner;
public class SecondGreatestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int greatest = Math.max(arr[0],arr[1]);
        int secondGreatest  = Math.min(arr[0],arr[1]);

        for (int i=2;i<arr.length;i++){
            if(arr[i]>greatest){
                secondGreatest = greatest;
                greatest = arr[i];
            }
            else if(arr[i]>secondGreatest && arr[i]!=greatest) {
                secondGreatest = arr[i];
            }
        }
        System.out.println(secondGreatest);
    }
}
