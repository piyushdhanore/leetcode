package leetCodeDaily;

import java.util.Arrays;

public class Question_884 {
    public static void main(String[] args) {

        String s = "hi there from new york";

        String [] s1 = s.split(",");

        System.out.println(Arrays.toString(s1));

        for (int i = 0; i < s1.length; i++) {
            System.out.println(s1[i]);
        }

        System.out.println(s1.length);
    }
}
