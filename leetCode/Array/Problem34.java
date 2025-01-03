package leetCode.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Problem34 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        if (size <= 0) {
            int[] arr = {-1,-1};
            System.out.println("Array size must be greater than 0.");
            System.out.println(Arrays.toString(arr));
            return;
        }

        int [] arr = new int[size];

        System.out.println("Enter the elements for the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the target to be searched: ");
        int target = sc.nextInt();

        int [] result = searchRange(arr,target);

        System.out.println(Arrays.toString(result));

    }

    public static int[] searchRange(int[] nums, int target) {

        int[] arr = {-1,-1};

        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==target){
                arr[0] = i;
                break;
            }
        }

        for (int i = nums.length-1; i >=0; i--) {
            if(nums[i]==target){
                arr[1] = i;
                break;
            }
        }
        return arr;
    }
}
