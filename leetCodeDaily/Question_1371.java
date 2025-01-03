package leetCodeDaily;

import java.util.Scanner;

public class Question_1371 {

    public static int findTheLongestSubstring(String s) {

        int out1 = 0;
        int out2 = 0;

        if (s.contains("a") || s.contains("e") || s.contains("i") || s.contains("o") || s.contains("u")) {
            out1++;
        }
        else{
            for (int i = 0; i < s.length(); i++) {
                out2++;
            }
            return out2;
        }

        return out1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.next();
        int result = findTheLongestSubstring(s);

        System.out.println("The longest Substring is: "+result);
    }
}
