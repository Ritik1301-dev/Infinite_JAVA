package Solution.OneDimensionalArray;
import java.util.Scanner;
public class Clg_Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size Of array : ");
        int Size = sc.nextInt();
        int Sum = 0;
        int [] arr = new int[Size];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter " + (i+1) + "th element");
            arr[i] = sc.nextInt();
            Sum += arr[i];
        }
        System.out.println("The Total Sum Of the Array ");
        System.out.println(Sum);
      }
}
