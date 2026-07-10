package Solution.ConditionStatement;
import java.util.Scanner;
public class GreatestBetweenWThreeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Inter your  1st value : ");
        int a = sc.nextInt();
        System.out.print("Inter your  2th value : ");
        int b = sc.nextInt();
        System.out.print("Inter your  3rd value : ");
        int c = sc.nextInt();
        System.out.print("Greatest Number is : ");
        if(a>b) if(a>c) System.out.println(a);
        else System.out.println(c);
        else if(b>c) System.out.println(b);
        else System.out.println(c);
        }
    }

