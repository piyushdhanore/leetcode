package scratchFrom;

import java.util.Scanner;

public class Scratch_8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String sentence = sc.nextLine();
//        String s = "deetcode easily yet tasted";

        String [] arr = sentence.split(" ");

        char first;
        char last;

        boolean flag = true;


        if (sentence.charAt(0)!=sentence.charAt(sentence.length()-1)){
            flag = false;
        } else if (arr.length==1 && arr[0].charAt(0)!=arr[0].charAt(arr[0].length() - 1)) {
            flag = false;
        }
        else {
            for (int i = 1; i < arr.length; i++) {

                last = arr[i-1].charAt(arr[i-1].length()-1);

                System.out.println(last);
                first = arr[i].charAt(0);
                System.out.println(first);

                //{"hi", "ioh"}
                if (last!=first){
                    flag = false;
                    break;
                }
            }
        }

        if (flag){
            System.out.println("Given string is circular string");
        }
        else{
            System.out.println("Given string is not circular string");
        }
    }
}
