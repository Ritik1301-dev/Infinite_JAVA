package Solution.Area;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st side :");
        double s1 = sc.nextDouble();
        System.out.print("Enter 2nd side :");
        double s2 = sc.nextDouble();
        System.out.print("Enter 3rd side :");
        double s3 = sc.nextDouble();
        double sp = (s1+s2+s3)/2;
        double Area = Math.sqrt(sp*(sp-s1)*(sp-s2)*(sp-s3));
        System.out.println(Area);
    }
}
