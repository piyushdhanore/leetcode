package leetCodeDaily;

public class Question_2825 {
    public static void main(String[] args) {

        String str1 = "abc";
        String str2 = "ad";

        Question_2825 que = new Question_2825();

        boolean res = que.canMakeSubsequence(str1,str2);

        if (res) System.out.println("Given string is a subsequence");
        else System.out.println("Given string is not a subsequence");

    }

    public boolean canMakeSubsequence(String str1, String str2) {

        int str2Index = 0;

        int lengthstr1 = str1.length(), lengthstr2 = str2.length();

        for (int str1Index = 0; str1Index < str1.length() && str2Index < str2.length(); str1Index++) {

            if (str1.charAt(str1Index)==str2.charAt(str2Index)) {
                str2Index++;
            }
        }

        return false;
    }
}
