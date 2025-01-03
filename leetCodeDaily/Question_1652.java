package leetCodeDaily;

import java.util.Arrays;
import java.util.Scanner;

public class Question_1652 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int [] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the key for the bomb: ");
        int key = sc.nextInt();

        System.out.println(Arrays.toString(decrypt(arr, key)));
    }

    public static int[] decrypt(int[] code, int k) {

        int n = code.length;
        int [] result = new int[n];

        if(k==0){
            return new int[n];
        }

        //determine the window range
        int absK = Math.abs(k);

        int [] circularArray = new int[n*2];

        for (int i = 0; i < n; i++) {
            circularArray[i] = code[i];
            circularArray[i+n] = code[i];
        }

        int windowSum = 0;

        //start index for the sliding window
        int start = (k>0)?1:n-absK;

        for (int i = start; i < start+absK; i++) {
            windowSum += circularArray[i];
        }

        //slide the window
        for (int i = 0; i < n; i++) {
            result[i] = windowSum;

            windowSum -= circularArray[start];
            windowSum += circularArray[start+absK];

            start++;
        }


        return result;
    }
}
