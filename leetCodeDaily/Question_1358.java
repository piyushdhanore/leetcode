package leetCodeDaily;
/*
1358. Number of Substrings Containing All Three Characters

Given a string s consisting only of characters a, b and c.

Return the number of substrings containing at least one occurrence of all these characters a, b and c.

Example 1:
Input: s = "abcabc"
Output: 10
Explanation: The substrings containing at least one occurrence of the characters a, b and c are
"abc", "abca", "abcab", "abcabc", "bca", "bcab", "bcabc", "cab", "cabc" and "abc" (again).

Example 2:
Input: s = "aaacb"
Output: 3
Explanation: The substrings containing at least one occurrence of the characters a, b and c
are "aaacb", "aacb" and "acb".

Example 3:
Input: s = "abc"
Output: 1
 */

public class Question_1358 {

    public static void main(String[] args) {

        String s = "abcabc";
//        String s = "aaacb";
//        String s = "abc";

        System.out.println(numberOfSubstrings(s));
    }

    public static int numberOfSubstrings(String s) {

        int output = 0;

        String req = "abc";

        for (int i = 0; i < s.length(); i++) {
            for (int j = 3; i+j <=s.length(); j++) {
               if ( s.substring(i,j).contains(req)){
                   output++;
               }
            }
        }

        return output;
    }
}
