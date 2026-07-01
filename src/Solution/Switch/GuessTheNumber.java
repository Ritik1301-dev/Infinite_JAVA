package Solution.Switch;
import java.util.Scanner;
public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = (int) (Math.random()*100) + 1;
        int user;
        int attempt = 5;
        while (true){
            attempt --;
            System.out.println("Enter value between 1 to 100 : ");
            user = sc.nextInt();
            if(user>num) System.out.println("To High");
            else if (user<num) System.out.println("To Low");
            else{
                System.out.println("Congrats");
                break;
            }
            if (attempt==0) break;
            System.out.println("Left Out Attempt : " + attempt);
        }
    }
}
