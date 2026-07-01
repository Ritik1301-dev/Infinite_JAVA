package Solution.Loop.ForLoop;
import java.util.Scanner;
public class FindPrimeFactorOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==0 || n==1) System.out.println("No Prime factors");
        for(int i=2; i<=n;i++){
            while(n%i==0) {
                System.out.print(i + " ");
                n = n/i;
            }
        }
    }
}
