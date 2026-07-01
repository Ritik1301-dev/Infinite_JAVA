package Solution.Loop.ForLoop;
import java.util.Scanner;
public class SumOfEvenAndOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int evensum = 0, oddsum = 1;
        for(int i=2; i<=n; i++) {
            if(i%2==0) evensum +=i;
            else oddsum+=i;
        }
        System.out.print("Even Sum :" + evensum);
        System.out.println();
        System.out.print("Odd Sum : " + oddsum);
    }
}
