package Solution.Loop.ForLoop;
import java.util.Scanner;
public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        System.out.println("Multiplication Table of " + n + " :");
        for (int i = 1; i <= 10; i++) {
            if (i <= 10) ans += n;
            System.out.println(n + " x " + i + " = " + ans);
        }
    }
}