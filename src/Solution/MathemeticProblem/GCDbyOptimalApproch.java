package Solution.MathemeticProblem;
import java.util.Scanner;
public class GCDbyOptimalApproch {
    static int GCD(int a , int b ){
        if(a == b) return a;
        if(a > b) return GCD( a = a-b , b);
        return GCD(a , b = b-a );
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first value : ");
        int firstValue = sc.nextInt();
        System.out.print("ENter second value : ");
        int secondValue = sc.nextInt();

//        while (firstValue != secondValue) {
//            if (firstValue>secondValue){
//                firstValue = firstValue - secondValue;
//            }
//            else {
//                secondValue = secondValue - firstValue;
//            }
//        }
//        System.out.println(firstValue);


//        one more approch
//        while (secondValue != 0) {
//            int temp = secondValue;
//            secondValue = firstValue % secondValue;
//            firstValue = temp;
//        }
//        System.out.println(firstValue);



        System.out.println(GCD(firstValue , secondValue));
    }
}
