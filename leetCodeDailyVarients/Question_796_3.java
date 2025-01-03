package leetCodeDailyVarients;

import java.util.Scanner;

public class Question_796_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first String: ");
        String s = sc.nextLine();

        System.out.print("Enter second String: ");
        String goal = sc.nextLine();

        if (rotateString(s,goal)){
            System.out.println("Two String are equal");
        }
        else {
            System.out.println("given Two String are not equal");
        }
    }

    public static boolean rotateString(String s, String goal){

        if (s.length()!=goal.length()) return false;

        String combined = s + s;

        if (combined.contains(goal)) return true;

        return false;
    }
}
