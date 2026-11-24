package Solution.Clq_Questions;
import javax.swing.plaf.synth.SynthTextAreaUI;
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

//    public static void main(String[] args) {
//        String arr[] = {"Hello World", "a b c d"};
//        int max = 0;
//        for (int i = 0; i < arr.length; i++) {
//            String words[] = arr[i].split(" ");
//            max = Math.max(max, words.length);
//        }
//        System.out.println(max);
//    }

    //  Frequency of each character

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//
//        int freq[] = new int[128];
//
//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//
//            freq[ch] = freq[ch] + 1;
//        }
//        for (int i = 0; i < freq.length; i++) {
//            if (freq[i] > 0) {
//                System.out.println((char) i+ "-> " + freq[i]);
//            }
//        }
//    }

    //  Frequency of each character(Optimal Approach )   ( Constraints = All character in small letter )

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//
//        int freq[] = new int[28];
//
//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//
//            freq[ch-97] = freq[ch-97] + 1;
//        }
//       for (int i=0;i<freq.length;i++){
//           if (freq[i] > 0){
//               System.out.println((char) (i+97) + "-> "+ freq[i]);
//           }
//       }
//    }


    //   Check anagram

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str1 = sc.nextLine();
//        String  str2   =  sc.nextLine();
//
//        if (str1.length() != str2.length()){
//            System.out.println("Not Anagram");
//        }
//        int [] arr = new int[26];
//
//        for (int i=0;i<str1.length();i++){
//                arr[str1.charAt(i) - 'a' ]++;
//        }
//         for (int i=0;i<str2.length();i++){
//             arr[str2.charAt(i) - 'a']--;
//         }
//
//         for (int i=0;i<arr.length;i++){
//             if (arr[i] != 0){
//                 System.out.println("Not Anagram");
//             }
//         }
//        System.out.println("String is Anagram");
//
//    }

       //   Sort the words of a sentence  (According to Lexicographical Order)


     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         String s = sc.nextLine();
         String [] arr = s.split(" ");

         for (int i=0;i< arr.length-1;i++){
             for (int j=0;j<arr.length-i-1;j++){
                  if (arr[j].compareTo(arr[j+1])>0){
                      String temp = arr[j];
                      arr[j] = arr[j+1];
                      arr[j+1] = temp;
                  }
             }
         }
         String ans = "";
         for (int i=0;i<arr.length;i++){
             ans += arr[i] + " ";
         }
         System.out.println(ans);
       }
}

