package scratchFrom;

import java.util.Scanner;

public class Scratch_7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");

        String s = sc.nextLine();

        System.out.println(s);

        System.out.println(swap(s));
    }

    public static long swap(String s){

        long count = 0;
        int oneSeen = 0;

        for (char c : s.toCharArray()) {
            if (c == '1') {
                oneSeen++;
            } else {
                count +=(long) oneSeen;
            }
        }

        return count;
    }
}
