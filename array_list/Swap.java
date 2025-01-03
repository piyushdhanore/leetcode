package array_list;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {

        int[] num = {1,2,3,4};

        System.out.println("Before Swapping: "+Arrays.toString(num));

        System.out.println(num);
        System.out.println(Arrays.toString(num));

        swap(num,1,2);

        System.out.println("After Swapping: "+Arrays.toString(num));

        System.out.println(Arrays.toString(num));
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

}
