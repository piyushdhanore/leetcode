package leetCodeDailyVarients;

import java.util.Scanner;

public class Question_796_2 {
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

        StringBuilder dup = new StringBuilder(goal);

        for (int i = 0; i < goal.length(); i++) {

            if (s.contentEquals(dup)){
                return true;
            }

            //dup = isRotate(dup); since you're modifying the same, no need to reassign
            isRotate(dup); // No reassignment needed
        }

        return false;
    }

    public static void isRotate(StringBuilder dup){

        char ch = dup.charAt(dup.length()-1);
        dup.deleteCharAt(dup.length()-1);
        dup.insert(0,ch); // Modifies the original object
        //return dup; since you're modifying the same, the method is set to void
    }
}
