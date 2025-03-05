package leetCode.Strings;

import java.util.Stack;

public class Question_20_2 {
    public static void main(String[] args) {
        String s = "([)]";
        if (isValid(s)){
            System.out.println("Given String is a valid string");
        } else {
            System.out.println("Given string is not a valid string");
        }
    }
    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<Character>();

        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }
}
