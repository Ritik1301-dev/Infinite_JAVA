package Solution.Loop.ForLoop;
import java.util.Scanner;
public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pow = sc.nextInt();
        int ans = 1;
        for (int i=1; i<=pow;i++){
            ans = ans*n;
        }
        System.out.println(ans);
    }
}
