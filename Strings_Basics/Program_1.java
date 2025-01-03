package Strings_Basics;

import java.util.Arrays;

public class Program_1 {
    public static void main(String[] args) {

        String [] arr = {"Java", "is", "very", "very", "easy"};

        isCount(arr);
    }


    public static void isCount(String[] arr) {
        int[] nums = new int[arr.length];

        for (int i=0; i< arr.length; i++){
            if (nums[i]==0){
                int count = 1;
                for (int j = i+1; j < arr.length; j++) {
                    if (arr[i].equals(arr[j])) {
                        count++;
                        nums[j]= -1;
                    }
                }
                System.out.println(arr[i]+": is repeated "+(count-1)+" times");
            }
        }
    }
}
