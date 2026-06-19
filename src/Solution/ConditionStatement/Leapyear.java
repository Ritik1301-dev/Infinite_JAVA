package Solution.ConditionStatement;
import java.util.Scanner;
public class Leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Year");
        int year = sc.nextInt();
        if((year%4 == 0 && year%10 != 0) || year % 400 == 0 ) System.out.println("Leap Year");
        else System.out.println("Normal Year");
    }
}
