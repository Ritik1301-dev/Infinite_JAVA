package Solution.MathemeticProblem;
import java.util.Scanner;
public class GCD {
    static int GCD(int a , int b , int min){
        if(min == 1) return 1;
        if (a%min==0 && b%min==0) return min;
        return GCD(a, b, min-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first value : ");
        int firstValue = sc.nextInt();
        System.out.print("ENter second value : ");
        int secondValue = sc.nextInt();

//        int ans = 1;
//
//        for (int i=Math.min(firstValue,secondValue); i>=1;i--){
//            if(firstValue%i==0 && secondValue%i==0) {
//                ans = i;
//                break;
//            }
//        }
//        System.out.println(ans);
        System.out.println(GCD(firstValue , secondValue , Math.min(firstValue,secondValue) ));
    }
}
