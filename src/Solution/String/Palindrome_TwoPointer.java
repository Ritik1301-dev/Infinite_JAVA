package Solution.String;

import java.util.Scanner;

public class Palindrome_TwoPointer {
    static boolean isPalindrome(String s){
        int i=0 , j = s.length()-1;
        while (i<j){
                if(s.charAt(i) != s.charAt(j)) return false;
                i++ ; j--;
            }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Eneter a value : ");
        String str = sc.nextLine();
//        boolean ans = isPalindrome(str);
//        System.out.println(ans);
       //  another step to print
        System.out.println(isPalindrome(str));
    }
}
