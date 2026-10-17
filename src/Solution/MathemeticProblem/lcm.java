package Solution.MathemeticProblem;
import java.util.*;
public class lcm {
    static int gcd(int a , int b){
    if(b == 0){
        return a;
    }
    return  gcd(b , a%b);
    }

    static int lcm(int a , int b){
        return Math.abs((a/gcd(a,b)) *b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Number :  ");
        int a = sc.nextInt();
        System.out.println("Enter the second number : ");
        int b =  sc.nextInt();

        System.out.println(lcm(a,b));
    }
}
