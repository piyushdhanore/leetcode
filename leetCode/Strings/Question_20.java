package leetCode.Strings;

/*
    Valid Parentheses

    Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

    An input string is valid if:

    Open brackets must be closed by the same type of brackets.
    Open brackets must be closed in the correct order.
    Every close bracket has a corresponding open bracket of the same type
    Example 1:
    Input: s = "()"
    Output: true

    Example 2:
    Input: s = "()[]{}"
    Output: true

    Example 3:
    Input: s = "(]"
    Output: false

    Example 4:
    Input: s = "([])"
    Output: true
 */

public class Question_20 {

    public static void main(String[] args) {

//        String s = "()";
//        String s = "()[]{}";
//        String s = "(]";
        String s = "([])";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {

        int curlCount = 0, roundCount=0, squareCount=0;

        if (s.contains(")") && !s.contains("(")) return false;
        else if (s.contains("]") && !s.contains("[")) return false;
        if (s.contains("}") && !s.contains("{")) return false;

        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i)=='(')) {
                roundCount++;
            } else if (s.charAt(i)=='[') {
                squareCount++;
            } else if (s.charAt(i)=='{') {
                curlCount++;
            } else if (s.charAt(i)==')') {
                roundCount--;
            } else if (s.charAt(i)==']') {
                squareCount--;
            } else if (s.charAt(i)=='}') {
                curlCount--;
            }
        }

        if(curlCount==0 && roundCount==0 && squareCount==0) return true;

        return false;
    }
}
