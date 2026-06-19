package Solution.Area;
import java.util.Scanner;
public class SurfaceAreaOfSphere {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double r = sc.nextDouble();
            System.out.println("Surface Area Of Sphere : "+ 4*Math.PI*r*r);
    }
}
