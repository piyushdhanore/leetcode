package leetCodeDailyVarients;

import java.util.Scanner;

public class Question_796_1 {
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

        for (int i = 0; i < goal.length(); i++) {

            if (s.equals(goal)){
                return true;

            }
            //new String object is created here
            goal = isRotate(goal);
        }
        
        return false;
    }

    public static String isRotate(String goal){
        String rot = ""+goal.charAt(goal.length()-1);
        for (int i = 0; i < goal.length()-1; i++) {
            rot+=goal.charAt(i);
        }
        return rot;
    }

}
