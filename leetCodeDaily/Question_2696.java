package leetCodeDaily;

import java.util.Scanner;

public class Question_2696 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String: ");
        String s = sc.nextLine();

        String code = s.toUpperCase();

        int length = minLength(code);

        System.out.println(length);
    }

    public static int minLength(String s) {

        boolean found = true;

        while (found){

            found = false;

            if (s.contains("AB")){
                s = s.replace("AB", "");
                found = true;
            } else if (s.contains("CD")) {
                s = s.replace("CD","");
                found = true;
            }
        }

        return s.length();
    }
}
