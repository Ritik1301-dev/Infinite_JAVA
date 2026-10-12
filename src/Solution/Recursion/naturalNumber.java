package Solution.Recursion;
import java.util.Scanner;
public class naturalNumber {
    static void fun(int n){
        if (n == 0) return;
        System.out.println(n);
        fun(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        fun(n);
    }
}
