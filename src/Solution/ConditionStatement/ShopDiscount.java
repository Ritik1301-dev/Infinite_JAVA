package Solution.ConditionStatement;
import java.util.Scanner;
public class ShopDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        if( 0 < amount  &&  amount < 5001) System.out.println(amount);
        else if((amount<7001)) System.out.println(  amount - (5*amount)/100);
        else if (amount<9001) System.out.println(amount - (10*amount)/100);
        else System.out.println( amount - (20*amount)/100);
    }
}
