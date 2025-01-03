package scratchFrom;

import java.util.Arrays;

public class Scratch_2 {
    public static void main(String[] args) {

        String s = "abcd#dcba";

//      abcd#dcba
//      s.length() = 9
        int[] lps = new int[s.length()];
        int length = 0; // Length of the previous longest prefix suffix
        int i = 1;


        while (i < s.length()) {

            System.out.print(s.charAt(length)+"-");
            System.out.print(s.charAt(i));
            System.out.print(" ,"+i);

            System.out.println();

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

        System.out.println(length);
        System.out.println(Arrays.toString(lps));
        System.out.println(i);
    }
}
