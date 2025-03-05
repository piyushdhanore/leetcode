package leetCodeDaily;

/*
    You are given a string s.
    Your task is to remove all digits by doing this operation repeatedly:
    Delete the first digit and the closest non-digit character to its left.
    Return the resulting string after removing all digits.

    Example 1:
    Input: s = "abc"
    Output: "abc"
    Explanation:
    There is no digit in the string.

    Example 2:
    Input: s = "cb34"
    Output: ""
    Explanation:
    First, we apply the operation on s[2], and s becomes "c4".
    Then we apply the operation on s[1], and s becomes "".
 */

public class Question_3174 {
    public static void main(String[] args) {

        String s = "cb34";
        System.out.println(clearDigits(s));
    }

    public static String clearDigits(String s) {

        StringBuilder s1 = new StringBuilder(s);

        while(true) {

            int digitIndex = -1;

            for (int i = 0; i < s1.length(); i++) {
                if (Character.isDigit(s1.charAt(i))){
                    digitIndex = i;
                    break;
                }
            }

            if (digitIndex==-1) break;

            for (int i = digitIndex-1; i >=0 ; i--) {
                if (!Character.isDigit(s1.charAt(i))){
                    s1.deleteCharAt(i);
                    digitIndex--;
                    break;
                }
            }

            s1.deleteCharAt(digitIndex);
        }

        return "";
    }
}
