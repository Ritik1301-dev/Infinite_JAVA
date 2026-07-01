package Solution.Loop.WhileLoop;
import java.util.Scanner;
public class CheckNeonNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int square = n * n;
        int sum = 0;

        while (square > 0) {
            int digit = square % 10;
            sum += digit;
            square /= 10;
        }

        if (sum == n) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
