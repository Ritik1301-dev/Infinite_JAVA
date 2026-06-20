package Solution.ConditionStatement;
import java.util.Scanner;
public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double unit = sc.nextDouble();
        double amount = 0;
        if(0<unit && unit<=100) System.out.println(unit*4.2);
         if(100<unit && unit<=200) System.out.println( (100*4.2) + (unit-100)*6);
         if(200<unit && unit<=400) System.out.println( (100*4.2) + (100*6) + (unit-200)*8);
        if( 400<unit) System.out.println( (100*4.2) + (100*6) + (200*8) + (unit-400)*13);


    }
}
