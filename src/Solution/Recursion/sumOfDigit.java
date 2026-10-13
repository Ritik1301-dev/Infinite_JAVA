package Solution.Recursion;
import java.util.Scanner;
public class sumOfDigit {
    static int SOD(int n){
        if( n == 0) return 0;
        return n%10 + SOD(n/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();
        System.out.print("the sum of digit is : ");
        System.out.println(SOD(n));
    }
}
