package Solution.Recursion;

import java.util.Scanner;
import java.util.Scanner;
public class printFibonacciSeries {
    static  int fibo(int n ){
        if(n==0 || n==1) return n;
        return fibo(n-1) + fibo(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();
        fibo(n);
        for (int i=0;i<n;i++){
            System.out.print(fibo(i) + " ");
    }
}
}
