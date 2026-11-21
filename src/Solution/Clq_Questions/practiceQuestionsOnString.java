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
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the String : ");
//        String s = sc.nextLine();
//        String ans = "";
//        for (int i = 0; i < s.length(); i++) {
//            char ch = s.charAt(i);
//
//            if (ch >= 'a' && ch < 'z'){
//                ans =   ans + (char)(ch - 32);
//            }else if (ch >= 'A' && ch <= 'Z'){
//                ans = ans + (char)(ch + 32);
//            }
//        }
//        System.out.println(ans);
//    }


//    Count words with given prefix
//         public static void main(String[] args) {
//    String str [] = {"pay", "attire", "practice", "attend"};
//    String pref = "at";
//    int count = 0;
//    for (String word : str){
//        if (word.startsWith(pref)) count++;
//    }
//    System.out.println(count);
//}

//  Capitalize first & last char of each word

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//
//        String strArr[] = str.split(" ");
//        String ans = "";
//
//        for (int i = 0; i < strArr.length; i++) {
//            String word = strArr[i];
//
//            if (word.length() <= 2) ans = ans + word.toUpperCase() + " ";
//            else {
//                ans = ans + Character.toUpperCase(word.charAt(0))
//                        + word.substring(1, word.length() - 1)
//                        + Character.toUpperCase(word.charAt(word.length() - 1))
//                        + " ";
//            }
//        }
//        System.out.println(ans);
//    }

    // Maximum number of words in a sentence

    public static void main(String[] args) {
        String arr[] = {"Hello World", "a b c d"};
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            String words[] = arr[i].split(" ");
            max = Math.max(max, words.length);
        }
        System.out.println(max);
    }
}
