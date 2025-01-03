package scratchFrom;

import java.util.Scanner;

public class Scratch_6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Sentence: ");

        String sentence = sc.nextLine();

        String [ ] arr = sentence.split(" ");

        System.out.println(arr.length);

        String s = "hi";
        System.out.println(s.charAt(s.length()-1));

        for (String a: arr){
            System.out.println(a);
        }
    }
}
