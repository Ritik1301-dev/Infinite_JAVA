package Solution.Area;
import java.util.Scanner;
public class CompoundInterest {
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       double p = sc.nextDouble();
       int n = sc.nextInt();
       double r = sc.nextDouble();
       double amount = p*Math.pow(1+(r/100),n);
        System.out.print(amount-p);
    }
}
