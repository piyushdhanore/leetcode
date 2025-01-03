package leetCode.Array;

import java.util.Scanner;

public class Problem_209 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int [] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target to be searched: ");
        int target = sc.nextInt();

        int result = minSubArrayLen(target,arr);

        System.out.println("The minimal length of subarray is: "+result);

    }

    public static int minSubArrayLen(int target, int[] nums) {

        int minLength = Integer.MAX_VALUE;
        int currentSum = 0;
        int start = 0;

        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];

            while (currentSum>=target){
                minLength = Math.min(minLength, i-start+1);
                currentSum -=nums[start];
                start++;
            }
        }

        return minLength==Integer.MAX_VALUE? 0: minLength;
    }
}
