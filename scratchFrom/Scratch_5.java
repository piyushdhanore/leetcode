package scratchFrom;

import java.util.Scanner;

public class Scratch_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");

        String s = sc.nextLine();

        System.out.println(s);

        System.out.println(swap(s));
    }

    public static long swap(String s) {

        long count = 0;

        char[] ch = s.toCharArray();

        for (int i = 0; i < ch.length - 1; i++) {

            for (int j = i+1; j <ch.length ; j++) {

                if (ch[i] == '1' && ch[j]=='0') {
                    count++;
                }
            }
        }

        return count;
    }
}
