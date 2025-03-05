package leetCode.Strings;

import java.util.Stack;

public class Question_20_1 {
    public static void main(String[] args) {

//        String s = "(*)";
//        String s = "()";
        String s = "()[]{}";
//        String s = "(]";
//        String s = "([])";
        if (isValid(s)) System.out.println("Given String is a valid String");
        else System.out.println("Given string is not a valid string");
    }

    public static boolean isValid(String s) {

        Stack<Integer> openStack = new Stack<>();
        Stack<Integer> starStack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (c=='(') {
                openStack.push(i);
            } else if (c=='*') {
                starStack.push(i);
            } else if(c==')') {
                if (!openStack.isEmpty()) {
                    openStack.pop();
                } else if (!starStack.isEmpty()) {
                    starStack.pop();
                }
            }
        }

        while(!openStack.isEmpty() && !starStack.isEmpty()) {
            int openIndex = openStack.pop();
            int starIndex = starStack.pop();

            if (openIndex>starIndex) return false;
        }

        return openStack.isEmpty();
    }
}
