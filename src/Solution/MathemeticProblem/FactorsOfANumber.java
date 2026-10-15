package Solution.MathemeticProblem;
import java.util.Scanner;
public class FactorsOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value : ");
        int n = sc.nextInt();
        for (int i=1;i<(int) Math.sqrt(n) ; i++){
            if (n%i == 0){
                System.out.print(i+ " ");

            }
        }
        for (int i = (int)Math.sqrt(n) ; i>=1;i--){
           if(n%i == 0){
               System.out.print(n/i + " ");
           }
        }
    }
}
