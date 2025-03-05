package leetCodeDailyVarients;

import java.util.Arrays;

public class Question_2161 {

    public static void main(String[] args) {

//        int [] nums = {9,12,5,10,14,3,10};
//        int pivot = 10;
        int [] nums = {-3,4,3,2};
        int pivot = 2;

        System.out.println(Arrays.toString(pivotArray(nums,pivot)));

    }

    public static int[] pivotArray(int[] nums, int pivot) {

        int [] shuffle = new int[nums.length];
        int left = 0, right = nums.length-1;

        for (int i = 0; i < shuffle.length; i++) {
            if (nums[i]<pivot){
                shuffle[left] = nums[i];
                left++;
            } else if (nums[i]>pivot) {
                shuffle[right]=nums[i];
                right--;
            } else {
                shuffle[i] = nums[i];
            }
        }

        return shuffle;
    }
}
