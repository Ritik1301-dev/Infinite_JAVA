package Solution.Loop.DoWhile;
import java.util.Scanner;
public class RepeatHello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
            do {
                System.out.println("Hello");
                System.out.println("Enter 1 if u want to print hello otherwise press another number");
                n = sc.nextInt();
            }while (n==1);
    }
}
