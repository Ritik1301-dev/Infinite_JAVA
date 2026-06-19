package Solution.Area;
import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        System.out.printf("Circumference : "+"%.2f",2*Math.PI*r);
        System.out.println();
        System.out.printf("Area : "+"%.2f",Math.PI*r*r);
    }
}
