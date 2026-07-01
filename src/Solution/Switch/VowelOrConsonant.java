package Solution.Switch;
import java.util.Scanner;
public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char n = sc.nextLine().charAt(0);
        if ((n >= 'A' && n <= 'Z') || (n >= 'a' && n <= 'z')) {
            switch (n) {
                case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> System.out.println("Vowel");
                default -> System.out.println("Consonant");
            }
        }else System.out.println("Not a letter");
    }
}
