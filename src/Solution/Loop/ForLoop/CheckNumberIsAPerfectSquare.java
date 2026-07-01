package Solution.Loop.ForLoop;
import java.util.Scanner;
public class CheckNumberIsAPerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean found = false;
        for(int i=1;i*i<=n;i++){
            if(i*i == n){
               found = true;
               break;
            }
        }
        if (found) System.out.println("Yes");
        else System.out.println("No");
    }
}

