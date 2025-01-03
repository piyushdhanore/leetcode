package leetCodeDaily;

import java.util.Arrays;
import java.util.Scanner;

public class Question_2938 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");

        String s = sc.nextLine();

        System.out.println(minimumSteps(s));

    }

    public static long minimumSteps(String s) {

        long count = 0;
        long blackCount = 0;

        char[] ch = s.toCharArray();

        for (char ball : ch) {
            if (ball == '1') {
                blackCount++; // Count black balls
            } else if (ball == '0') {
                count +=blackCount;
            }
        }

        return count;
    }
}
