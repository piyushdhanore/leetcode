package scratchFrom;

import java.util.Arrays;

public class Scratch_4 {
    public static void main(String[] args) {
        int[] arr ={40,20,30,10};

        int[] array = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {

                if (arr[i]>arr[j]){

                    System.out.println(arr[i]);
                    System.out.println(arr[j]);
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    System.out.println(Arrays.toString(arr));
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
