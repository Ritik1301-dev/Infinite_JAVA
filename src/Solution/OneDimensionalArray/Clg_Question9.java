package Solution.OneDimensionalArray;
 // Create a new array for even or odd number
import java.util.Arrays;
import java.util.Scanner;

public class Clg_Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i=0;i<arr.length;i++){
            System.out.println((i+1) + "th element");
            arr[i] = sc.nextInt();
        }
        int evenNum = 0;
        int oddNum = 0;
        for(int i=-0;i<arr.length;i++){
          if(arr[i] % 2==0){
              evenNum++;
          }else {
              oddNum++;
          }
        }

        int [] evenArr = new int[evenNum];
        int [] oddArr = new int[oddNum];
        int e=0;
        int o=0;

        for (int i=0;i<arr.length;i++){
            if(arr[i] % 2==0){
                evenArr [e] = arr[i];
                e++;
            }else {
                oddArr [o] = arr[i];
                o++;
            }
        }
        System.out.println(Arrays.toString(evenArr));
        System.out.println(Arrays.toString(oddArr));
    }
}
