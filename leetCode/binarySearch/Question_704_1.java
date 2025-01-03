package leetCode.binarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class Question_704_1 {
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

        Arrays.sort(arr);

        int index = search(arr, target);

        if (index >= 0) {
            System.out.println("The given element is present in the array at index: "+index);
        }else {
            System.out.println("The given element is not present in the array");
        }

    }

    public static int search(int[] nums, int target) {

        int left = 0, right = nums.length-1;

        while(left<=right){
            int mid = left + (right-left)/2;
            if (nums[mid]==target){
                return mid;
            } else if (nums[mid]<target) {
                left = mid+1;
            }else if (nums[mid]>target){
                right = mid-1;
            }
        }

        return -1;
    }
}
