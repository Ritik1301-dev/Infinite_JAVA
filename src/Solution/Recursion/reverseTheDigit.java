package Solution.Recursion;
import java.util.Scanner;
public class reverseTheDigit {
    static int ROD(int n ,int  rev ){
        if(n == 0) return  rev;
        return ROD( n/10 , rev*10 +(n%10));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(ROD(n , 0));
    }
}
