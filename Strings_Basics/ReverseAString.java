package Strings_Basics;

import java.util.Arrays;

public class ReverseAString {
    public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("Enter the String: ");
//		String str = sc.next();

        String str = "I love Bharat";

        String [] sp = str.split(" ");

        System.out.println(Arrays.toString(sp));

        String ans = "";

        for (int i = 0; i < sp.length; i++) {
            sp[i] = reverse(sp[i]);
            if (i==sp.length-1) {
                ans+=sp[i];
            } else {
                ans+=sp[i]+" ";
            }
        }

        System.out.println(ans);

//		sc.close();

    }

    public static String reverse(String s) {

        String rev = "";

        for (int i = s.length()-1; i >=0; i--) {
            rev+=s.charAt(i);
        }

        return rev;
    }
}
