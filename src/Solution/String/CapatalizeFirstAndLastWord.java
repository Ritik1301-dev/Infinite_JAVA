package Solution.String;
import java.util.Arrays;
import java.util.Scanner;
public class CapatalizeFirstAndLastWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a String : ");
        String str = sc.nextLine();
        String strArr [] = str.split(" ");
        String ans = "";
        for (int i=0;i<strArr.length;i++){
            String Word = strArr[i];
            if(Word.length() <=2){
              ans = ans + Word.toUpperCase() + " ";
            }else {
            ans = ans + Character.toUpperCase(Word.charAt(0))
                    + Word.substring(1,Word.length()-1) +
                    Character.toUpperCase(Word.charAt(Word.length()-1)) + " ";
        }

    }
        System.out.print(ans);
        }
}
