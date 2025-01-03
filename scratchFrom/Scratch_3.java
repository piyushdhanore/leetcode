package scratchFrom;

import java.util.Scanner;

public class Scratch_3 {
    public static void main(String[] args) {

        String s1 = "eetcode";
        String [] array = s1.split(" ");

        char first = s1.charAt(0);
        char last = s1.charAt(s1.length()-1);

        if (first==last){
            System.out.println("Given string is damn hot");
        }

        if (array.length==1 && array[0].equals(array[array.length-1])){
            System.out.println("Array contains only one element");
            System.out.println("Given array is hot");
        }

        Scanner ch = new Scanner(System.in);

        String chars = ch.nextLine();

        String [] arr = chars.split(" ");

        if (chars.charAt(0)==chars.charAt(chars.length()-1)){
            System.out.println("True");
        }
        else if (chars.charAt(0)!=chars.charAt(chars.length()-1)){
            System.out.println("False");
        }

        System.out.println("****************************");

        if (arr.length==1 && arr[0].equals(arr[arr.length-1])){
            System.out.println("Given array is circular");
        }
    }
}
