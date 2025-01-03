package leetCodeDaily;

import java.util.Scanner;

public class Question_2490 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Sentence: ");

        String sentence = sc.nextLine();

        if (isCircularSentence(sentence)){
            System.out.println("The given sentence is Circular sentence");
        }
        else {
            System.out.println("The given sentence is not circular sentence");
        }
    }

    public static boolean isCircularSentence(String sentence) {

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

        return flag;
    }
}
