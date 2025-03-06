package leetCode.Strings;

/*
    Valid Parenthesis String
    Given a string s containing only three types of characters: '(', ')' and '*', return true if s is valid.

    The following rules define a valid string:
    Any left parenthesis '(' must have a corresponding right parenthesis ')'.
    Any right parenthesis ')' must have a corresponding left parenthesis '('.
    Left parenthesis '(' must go before the corresponding right parenthesis ')'.
    '*' could be treated as a single right parenthesis ')' or a single left parenthesis '(' or an empty string "".

    Example 1:
    Input: s = "()"
    Output: true

    Example 2:
    Input: s = "(*)"
    Output: true

    Example 3:
    Input: s = "(*))"
    Output: true

 */

public class Question_678 {

    public static void main(String[] args) {

//        String s = "((*))";
//        String s = "(*))";
//        String s = "()";
//        String s = "((*))";
//        String s = "((((((((((((((((((((((((((((((((((((((((((((((";
//        String s = "(((((()*)(*)*))())())(()())())))((**)))))(()())()";
        String s = "((()((()))(())()())*)(()(())()))()))))(((*(()(((()()(())()))*(())*)(()(()(()()()))()(()()()";
        System.out.println(checkValidString3(s));
    }

    public static boolean checkValidString(String s) {

        int paraCount = 0, asterisk=0;
//        int open = 0, closed =0;

        if(s.charAt(0)==')') return false;
        else if (!s.contains(")")) return false;

        for (int i = 0; i < s.length(); i++) {

            if(s.charAt(i)=='(') {
                paraCount++;
//                open++;
            } else if (s.charAt(i)==')') {
                paraCount--;
//                closed++;
            }
        }

        if ((paraCount==1 || paraCount==-1) && s.contains("*")) return true;

        return paraCount >= 0 && (paraCount % 2 == 0);
    }

    public static void checkValidString2(String s) {

        int open = 0, closed =0;
        for (int i = 0; i < s.length(); i++) {

            if(s.charAt(i)=='(') {
                open++;
            } else if (s.charAt(i)==')') {
                closed++;
            }
        }

        System.out.println("Open parenthesis are: "+open);
        System.out.println("closed parenthesis are: "+closed);
    }

    public static boolean checkValidString3(String s) {

        int paraCount = 0, asterisk=0;

        if(s.charAt(0)==')') return false;
        else if (!s.contains(")")) return false;

        for (int i = 0; i < s.length(); i++) {

            if(s.charAt(i)=='(') {
                paraCount++;
            } else if (s.charAt(i)==')') {
                paraCount--;
            } else if (s.charAt(i)=='*') {
                if (paraCount<0){
                    paraCount++;
                } else if (paraCount>0){
                    paraCount--;
                }
            }
        }

        return paraCount == 0;
    }
}
