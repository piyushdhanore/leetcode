package array_list;

import java.util.Arrays;

public class Max {
    public static void main(String[] args) {

        int[] num = {1,2,3,4,10,69};

        System.out.println(Arrays.toString(num));
        System.out.println(max(num));
        System.out.println(maxRange(num,1,5));
    }

    public static int max(int[] arr) {

        int large = Integer.MIN_VALUE;

//        using for for loop
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>large) {
                large = arr[i];
            }
        }

//        using enhanced for loop
        for (int j : arr) {
            if (j > large) {
                large = j;
            }
        }

        System.out.println("Maximum value in the given array is:");
        return large;
    }

    public static int maxRange(int[] arr, int start, int end) {

        int maxVal = arr[start];
        for (int i=start; i<end; i++) {
            if (arr[i]>maxVal){
                maxVal = arr[i];
            }
        }

        System.out.println("Maximum value from the given range "+start+" to "+end+" is:");
        return maxVal;
    }
}
