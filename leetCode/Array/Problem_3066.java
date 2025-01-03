package leetCode.Array;

import java.util.Scanner;

public class Problem_3066 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target element: ");
        int target = sc.nextInt();

        int result = minOperations(arr, target);

        System.out.println(result);
    }

    public static int minOperations(int[] nums, int k) {

        int output = 0;

        return output;
    }
}
