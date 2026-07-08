package Solution.ConditionStatement;
import java.util.Scanner;
public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the unit : ");
        double unit = sc.nextDouble();
        double amount = 0;

        // suppose unit is 650
        if (unit>400){  // 250  unit is used
            amount = (unit-400)*13;
            unit = 400;
        }
        if (unit>200 && unit<=400){ // 200 unit is used
            amount += (unit-200)*8;
            unit = 200;
        }
        if (unit>100 && unit<=200){  //  100 unit is used
            amount += (unit-100)*6;
            unit =100;
        }
        amount += unit*4.2;  // left all units are used
        System.out.print("The amount is : ");
        System.out.println(amount);
    }
}
