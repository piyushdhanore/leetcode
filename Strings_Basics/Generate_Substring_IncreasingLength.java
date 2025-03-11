package Strings_Basics;

public class Generate_Substring_IncreasingLength {
    public static void main(String[] args) {
        String s = "abcdedfghijk";

        generateSubstrings(s);
    }

    public static void generateSubstrings(String str) {

        int n = str.length();
        for (int i = 0; i < n; i++) {
            for (int len = 3; len <= n; len++) {
                if (i + len <= n) {
                    System.out.println(str.substring(i, i + len));
                }
            }
            System.out.println(); // For readability
        }
    }
}
