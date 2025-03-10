package scratchFrom;

import java.util.Arrays;

public class Scratch_1 {
    public static void main(String[] args) {

        String s = "abcd";
        System.out.println(shortestPalindrome(s)); // Output: "dcbabcd"
    }

    public static String shortestPalindrome(String s) {

        if (s == null || s.length() <= 1) {
            return s;
        }

        String reverse = new StringBuilder(s).reverse().toString();
        String combined = s + "#" + reverse;

        System.out.println("combined.length() is: "+combined.length());
//        abcd#dcba

        int[] lps = computeLPS(combined);
        System.out.println(Arrays.toString(lps));

        System.out.println("S.length() is: "+s.length());
        System.out.println("lps[combined.length() - 1] is: "+lps[combined.length() - 1]);
        int charsToAdd = s.length() - lps[combined.length() - 1];

        System.out.println(charsToAdd);

        String prefix = reverse.substring(0, charsToAdd);
        return prefix + s;
    }

    private static int[] computeLPS(String s) {

//      s = abcd#dcba
//      s.length() = 9
        int[] lps = new int[s.length()];
        int length = 0; // Length of the previous longest prefix suffix
        int i = 1;

//        length = 0, [], i=1

        while (i < s.length()) {
            if (s.charAt(i) == s.charAt(length)) {
                length++;
                lps[i] = length;
                i++;
            }
            else {
                if (length != 0) {
                    length = lps[length - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }
}
