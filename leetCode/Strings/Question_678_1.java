package leetCode.Strings;

public class Question_678_1 {
    public static void main(String[] args) {

        String s = "((()((()))(())()())*)(()(())()))()))))(((*(()(((()()(())()))*(())*)(()(()(()()()))()(()()()";
        System.out.println(checkValidString(s));
    }

    public static boolean checkValidString(String s) {

        int openMax =0, closeMin = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i)=='('){
                openMax++;
                closeMin++;
            } else if (s.charAt(i)==')') {
                openMax--;
                closeMin--;
            } else if (s.charAt(i)=='*'){
                openMax++;
                closeMin--;
            }

            if (openMax<0) return false;

            closeMin = Math.max(closeMin,0);
        }

        return closeMin==0;
    }
}
