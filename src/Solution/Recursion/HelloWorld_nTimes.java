package Solution.Recursion;
import java.util.Scanner;
public class HelloWorld_nTimes {
    static void fun(int n ){
        if( n==0) return;
        System.out.println("Hello World");
        fun(n-1);
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
       int n = sc.nextInt();
       fun(n);
    }
}
