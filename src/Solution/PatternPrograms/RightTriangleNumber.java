package Solution.PatternPrograms;
import java.util.Scanner;
public class RightTriangleNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            int digit = 1;
            for(int j=1;j<=i;j++){
                System.out.print(digit + " ");
                digit++;
            }
            System.out.println();
        }
    }
}
