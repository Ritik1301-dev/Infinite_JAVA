package Solution.MathemeticProblem;
import java.util.Scanner;
public class CountDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value : ");
        int n = sc.nextInt();
        System.out.println((int) Math.log10(n) + 1);
    }
}
