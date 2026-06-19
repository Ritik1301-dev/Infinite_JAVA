package Solution.ConditionStatement;
import java.util.Scanner;
public class ValidVoter {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your Name ");
        String name = sc.nextLine();
        System.out.println("Enter your Age ");
        int age = sc.nextInt();
        if(age>=18) System.out.println("Hello "+ name +", you are a voter." );
        else System.out.println("Hello "+ name +", you will be eligible to vote in "+ (18-age)+ " years.");
    }
}
