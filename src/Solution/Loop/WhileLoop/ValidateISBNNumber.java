package Solution.Loop.WhileLoop;
import java.util.Scanner;
public class ValidateISBNNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long temp = n;

        int count = 0;
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        if (count != 10) {
            System.out.println("false");
            return;
        }

        int[] digit = new int[10];

        for (int i = 9; i >= 0; i--) {
            digit[i] = (int)(n % 10);
            n /= 10;
        }

        int sum = 0;

        for (int i = 0; i < 10; i++) {
            sum += digit[i] * (i + 1);
        }

        if (sum % 11 == 0)
            System.out.println("true");
        else
            System.out.println("false");
    }
}
