package Solution.Clq_Questions;
import java.util.*;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int first = 0, second = 1 , sum = 0;
        for (int i=0;i<=num;i++){
            sum = first + second;
            first = second;
            second = sum;
            System.out.print(sum + " ");
        }

    }
}
