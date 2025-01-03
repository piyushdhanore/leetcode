package algorithm;

// Find the Maximum Sum of a Subarray of Size k

import java.util.Scanner;

public class SlidingWindow {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int [] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the size k: ");
        int key = sc.nextInt();

        int max = maxSumSubarray(arr, key);

        System.out.println(max);
    }

    public static int maxSumSubarray(int[] arr, int k) {
        int maxSum = 0;
        int currentSum = 0;

        // Create the initial window
        for (int i = 0; i < k; i++) {
            currentSum += arr[i];
        }
        maxSum = currentSum;

        // Slide the window
        for (int i = k; i < arr.length; i++) {
            currentSum += arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

}
