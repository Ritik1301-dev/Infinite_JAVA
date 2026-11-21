package Solution.Clq_Questions;
import java.util.*;
public class practiceQuestionsOnString {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the String : ");
//        String s = sc.nextLine();
//        String rev = "";
//        for (int i=s.length()-1;i>=0;i--){
//           rev  += s.charAt(i);
//            }
//        System.out.println(rev);
//    }


      //  check palindrome

//    static  boolean isPalindrome(String s){
//        int i=0 ;
//        int j=s.length()-1;
//        while (i<j){
//            if (s.charAt(i) != s.charAt(j) ) return false;
//          i++;
//          j--;
//        }
//        return true;
//    };
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the String : ");
//        String s = sc.nextLine();
//        System.out.println(isPalindrome(s));
//    }




        //   count vowel and consonants

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the String : ");
//        String s = sc.nextLine();
//         int vowel = 0;
//         int consonant = 0;
//         int space = 0;
//        for (int i=0;i<s.length();i++){
//            char ch = s.charAt(i);
//
//            switch (ch){
//                case 'a','e','i','o','u' -> vowel++;
//                case ' ' -> space++;
//                default -> consonant++;
//            }
//        }
//        System.out.println("Vowel : " + vowel);
//        System.out.println("Consonant : " + consonant );
//        System.out.println("Spaces : " + space);
//    }


     //  Toggle characters
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String s = sc.nextLine();
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isLowerCase(ch)) {
                ans = ans + Character.toUpperCase(ch);
            } else {
                ans = ans + Character.toLowerCase(ch);
            }
        }
        System.out.println(ans);
    }
}
