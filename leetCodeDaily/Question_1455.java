package leetCodeDaily;

import java.util.Arrays;
import java.util.Scanner;

public class Question_1455 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the sentence: ");
        String sentence = sc.nextLine();

        System.out.println("Enter the word to be searched: ");
        String search = sc.nextLine();

        int result = isPrefixOfWord(sentence, search);
        System.out.println(result);
    }

    public static int isPrefixOfWord(String sentence, String searchWord) {

        int output = 0;

        String [] arr = sentence.split(" ");

        System.out.println(Arrays.toString(arr));

        for (int i=0; i<arr.length; i++){

            if (arr[i].startsWith(searchWord)){
                output = i;
                return output+1;
            }
        }

        return -1;
    }
}
