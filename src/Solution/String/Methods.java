package Solution.String;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String s = "Check Mate";
        System.out.println(s.length());
        System.out.println(s.charAt(3));
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.startsWith("Ri"));
        System.out.println(s.endsWith("se"));
        System.out.println(s.substring(2));
        System.out.println(s.substring(2,5));
        System.out.println(s.indexOf("ko"));
        System.out.println(s.lastIndexOf("k"));
        System.out.println(s.contains("A"));
        System.out.println(s.trim());
        String str [] = s.split(" ");
        for(String temp : str ){
            System.out.println(temp);
        }
        char[] ch = s.toCharArray();
        System.out.println(Arrays.toString(ch));
        String s2 =  "check mate";
        System.out.println(s.equalsIgnoreCase(s2));


        String s3 = "Falana Dinkala ";
        String s4 = "Oluuu ka Fathaaa";
        System.out.println(s4.compareTo(s3));
    }
}
