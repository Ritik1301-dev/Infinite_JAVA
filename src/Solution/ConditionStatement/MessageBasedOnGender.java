package Solution.ConditionStatement;
import java.util.Scanner;
public class MessageBasedOnGender {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.nextLine().charAt(0);
        if(ch == 'm' || ch == 'M') System.out.println("Hello, Sir!");
        else if(ch == 'f' || ch == 'F' ) System.out.println("Hello, Ma'am!");
        else System.out.println("Hello, Guest!");
    }
}
