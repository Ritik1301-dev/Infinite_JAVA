package Solution.Area;
import java.util.Scanner;
public class AreaOfReactangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int bre = sc.nextInt();
        System.out.println("Area : " + len * bre);
        System.out.println("Perimeter : " + 2 * (len + bre));
    }
}