package Solution.Loop.ForLoop;
import java.util.Scanner;
public class FactorialOfn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int multiply = 1;
        for(int i=1; i<=n; i++){
            multiply *=i;
        }
        System.out.println(multiply);
    }
}
