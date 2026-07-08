package Solution.Loop.ForLoop;
import java.util.Scanner;
public class CheckPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        if(n<=1) System.out.println("Not Prime Number");
        else if(n==2) System.out.println("Prime Number");
        else {
            boolean isprime = true ;
            for (int i=3 ;i<=(int)Math.sqrt(n);i+=2){
                if (n%i==0){
                    isprime = false;
                    break;
                }
            }
            System.out.println(isprime? "Prime Number" : "Not Prime Number");
        }
    }
}
