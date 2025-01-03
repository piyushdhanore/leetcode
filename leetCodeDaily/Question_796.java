package leetCodeDaily;

import java.util.Scanner;

public class Question_796 {

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

    public static boolean rotateString(String s, String goal) {

        StringBuilder dup = new StringBuilder(goal);

        for (int i = 0; i < s.length(); i++) {
            // here you are comparing the same String
            //if (s.equals(goal))
            if (s.contentEquals(dup)){
                return true;
            }

            dup = isRotate(dup);
        }
        return false;
    }

    public static StringBuilder isRotate(StringBuilder goal){

        StringBuilder rot = new StringBuilder();

        rot.append(goal.charAt(goal.length()-1));

        for (int i =0; i<goal.length()-1; i++){
            rot.append(goal.charAt(i));
        }
        return rot;
    }
}
