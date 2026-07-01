package Solution.Loop.DoWhile;
import java.util.Scanner;
public class MenuDrivemCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, num1, num2;
        do {
            System.out.println("Enter 1 for Addition\n" + "Enter 2 for Sunstraction\n" +
                    "Enter 3 for Division\n" + "Enter 4 for Multiplication\n" + "Enter 5 for exiting program");
            n = sc.nextInt();
            if (n == 1) {
                System.out.print("Enter first number : ");
                num1 = sc.nextInt();
                System.out.print("Enter second number : ");
                num2 = sc.nextInt();
                System.out.println("Addition is : " + (num1 + num2));
            }
                else if (n == 2) {
                    System.out.print("Enter first number : ");
                    num1 = sc.nextInt();
                    System.out.print("Enter second number : ");
                    num2 = sc.nextInt();
                    System.out.println("Substraction is : " + (num1 - num2));
            } else if (n == 3) {
                System.out.print("Enter first number : ");
                num1 = sc.nextInt();
                System.out.print("Enter second number : ");
                num2 = sc.nextInt();
                if(num2==0) System.out.println("Not Define");
                 else System.out.println("Division is : " + (num1 / num2));
            } else if (n == 4) {
                System.out.print("Enter first number : ");
                num1 = sc.nextInt();
                System.out.print("Enter second number : ");
                num2 = sc.nextInt();
                System.out.println("Multiplication is : " + (num1 * num2));
            } else if (n == 5) System.exit(0);
            else System.out.println("Invalid input");
        } while (true);
    }
}
