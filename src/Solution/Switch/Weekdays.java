package Solution.Switch;
import java.util.Scanner;
public class Weekdays {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        String ans = switch (n) {
            case 1 -> {
                yield "Monday";
            }
            case 2 -> {
                yield "Tuesday";
            }
            case 3 -> {
                yield "Wednesday";
            }
            case 4 -> {
                yield "Thursday";
            }
            case 5 -> {
                yield "Friday";
            }
            case 6 -> {
                yield "Saturday";
            }
            case 7 -> {
                yield "Sunday";
            }
                default -> {
                yield "Invalid input";
            }

        };
        System.out.println(ans);
    }
}
