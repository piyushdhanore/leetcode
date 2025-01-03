package leetCodeDailyVarients;

import java.util.Arrays;
import java.util.Scanner;

public class Question_2563_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int [] nums = new int[size];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < nums.length; i++) {

            nums[i] = sc.nextInt();
        }

        System.out.println("Enter the lower limit");
        int lower = sc.nextInt();

        System.out.println("Enter the upper limit");
        int upper = sc.nextInt();

        long result = countFairPairs(nums, lower, upper);

        System.out.println("The number of fair pairs in the given array are: "+result);
        sc.close();
    }

    public static long countFairPairs(int[] nums, int lower, int upper) {

        Arrays.sort(nums);
        long count = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int low = i + 1, high = n - 1;

            // Find the first position that satisfies nums[i] + nums[low] >= lower
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (nums[i] + nums[mid] >= lower) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            int leftBound = low;

            low = i + 1; high = n - 1;

            // Find first position where nums[i] + nums[low] > upper
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (nums[i] + nums[mid] > upper) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            int rightBound = high;

            if (rightBound >= leftBound) {
                count += rightBound - leftBound + 1;
            }
        }
        return count;
    }
}
