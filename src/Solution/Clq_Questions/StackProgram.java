package Solution.Clq_Questions;
import java.util.*;
import java.util.Iterator;
import java.util.Stack;

public class StackProgram {
//    public static void main(String[] args) {
//        Stack<String> stack = new Stack<String>();
//        stack.push("Ayush");
//        stack.push("Priyanshu");
//        stack.push("Vaibhav");
//        stack.push("Mahi");
//        stack.push("Khushi");
//
//        stack.pop();
//        Iterator<String> itr = stack.iterator();
//        while (itr.hasNext()){
//            System.out.println(itr.next());
//        }
//    }


//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//
//        Stack<Character> st = new Stack<>();
//
//        for (int i = 0; i < s.length(); i++) {
//            char ch = s.charAt(i);
//
//            // Opening brackets
//            if (ch == '(' || ch == '{' || ch == '[') {
//                st.push(ch);
//            }
//
//            // Closing brackets
//            else if (ch == ')' || ch == '}' || ch == ']') {
//
//                if (st.isEmpty()) {
//                    System.out.println("not balanced");
//                    return;
//                }
//
//                char top = st.pop();
//
//                if ((ch == ')' && top != '(') ||
//                        (ch == '}' && top != '{') ||
//                        (ch == ']' && top != '[')) {
//                    System.out.println("not balanced");
//                    return;
//                }
//            }
//        }
//
//        if (st.isEmpty()) {
//            System.out.println("balanced");
//        } else {
//            System.out.println("not balanced");
//        }
//    }


    public static void main(String[] args) {
        String expression = "23*54*+9-";
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            if (Character.isDigit(ch)) {
                stack.push(ch - '0');
            } else {
                int b = stack.pop();
                int a = stack.pop();
                switch (ch) {
                    case '+':
                        stack.push(a + b);
                        break;
                    case '*':
                        stack.push(a * b);
                        break;
                    case '-':
                        stack.push(a - b);
                        break;
                    case '/':
                        stack.push(a / b);
                        break;
                }
            }
        }
        System.out.println("Output: " + stack.pop());
    }
}