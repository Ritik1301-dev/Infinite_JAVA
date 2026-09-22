package Solution.String;

import java.util.Scanner;

public class ToggleCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String ");
        String str = sc.nextLine();
        String ans = "";
        for (int i=0;i< str.length();i++){
            char ch = str.charAt(i);
            if(Character.isLowerCase(ch)){
                ans += Character.toUpperCase(ch);
            }else {
                ans += Character.toLowerCase(ch);
            }
        }
        System.out.println(ans);
    }
}
