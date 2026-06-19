package Solution.ConditionStatement;
import java.util.Scanner;
public class GraetestBetweenTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a>b) System.out.println(a);
        else System.out.println(b);
    }
}
