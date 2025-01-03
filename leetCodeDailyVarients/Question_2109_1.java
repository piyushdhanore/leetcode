package leetCodeDailyVarients;

public class Question_2109_1 {
    public static void main(String[] args) {

        String s = "LeetCodeHelpsMeLearn";

        System.out.println(s);

//        System.out.println(s.length());

        int[] spaces = {8,13,15};

        String newString = addSpaces(s,spaces);

        System.out.println(newString);
    }

    public static  String addSpaces(String s, int[] spaces) {

        String output = "";

        for (int i = 0, j=0; i < s.length(); i++) {

            if (j< spaces.length && spaces[j]==i) {
                output+= " ";
                j++;
            }
            output+= s.charAt(i);
        }

        return output;
    }
}
