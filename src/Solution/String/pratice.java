package Solution.String;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class pratice {
    public static void main(String[] args) {
        String s = "Ten millon dollar";
        System.out.println(s.length());
        System.out.println(s.charAt(4));
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.startsWith("T"));
        System.out.println(s.endsWith("llar"));
        System.out.println(s.substring(2));
        System.out.println(s.substring(3,6));
        System.out.println(s.indexOf("milllon"));
        System.out.println(s.contains("q"));
        System.out.println(s.trim());
         String str[] =  s.split(" ");
         for(String temp : str){
             System.out.println(temp);
         }
         char ch[] = s.toCharArray();
        System.out.println(Arrays.toString(ch));
        String s2 = "Ten millon Dollar";
        System.out.println(s.equals(s2));
        System.out.println(s.equalsIgnoreCase(s2));
    }
}
