package leetCode.Array;

import java.util.Scanner;

public class Problem35 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int [] arr = new int[size];

        System.out.println("Enter the elements for the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the integer to be searched: ");
        int target = sc.nextInt();

        System.out.println(searchInsert(arr,target));
    }

    public static int searchInsert(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>=target) {
                return i;
            }
        }

        return nums.length;
    }
}
