package Solution.Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class checkPalindrome {
    static boolean isPalindrome(String str , int i, int j){
        if (i>=j) return true;
        if (str.charAt(i) != str.charAt(j)) return false;
        return isPalindrome(str ,i+1 , j-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String : ");
        String str = sc.nextLine();
        System.out.println(isPalindrome(str , 0 , str.length()-1));
    }
}
