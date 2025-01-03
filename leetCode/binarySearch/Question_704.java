package leetCode.binarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class Question_704 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int [] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element to be searched: ");
        int target = sc.nextInt();

        int index = search(arr, target);

        if (index >= 0) {
            System.out.println("The given element is present in the array at index: "+index);
        }else {
            System.out.println("The given element is not present in the array");
        }

    }

    public static int search(int[] nums, int target) {

        Arrays.sort(nums);

        int left = 0, right = nums.length-1;

        while(left<=right){
            if (nums[left]==target){
                return left;
            } else if (nums[right]==target) {
                return right;
            }else {
                left++;
                right--;
            }
        }

        return -1;
    }
}
