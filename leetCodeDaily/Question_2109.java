package leetCodeDaily;

public class Question_2109 {
    public static void main(String[] args) {

        String s = "LeetCodeHelpsMeLearn";

        System.out.println(s);

//        System.out.println(s.length());

        int[] spaces = {8,13,15};

        String newString = addSpaces(s,spaces);

        System.out.println(newString);
    }

    public static  String addSpaces(String s, int[] spaces) {

        StringBuilder output = new StringBuilder(s.length());

        for (int i = 0, j=0; i < s.length(); i++) {

            if (j< spaces.length && spaces[j]==i) {
                output.append(" ");
                j++;
            }
            output.append(s.charAt(i));
        }

        return output.toString();
    }
}
