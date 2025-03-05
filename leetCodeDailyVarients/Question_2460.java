package leetCodeDailyVarients;

import java.util.Arrays;

public class Question_2460 {
    public static void main(String[] args) {
        
//        int[] nums = {1,2,2,1,1,0};
//       int[] nums = {0,1};
        int[] nums = {847,847,0,0,0,399,416,416,879,879,206,206,206,272};

        System.out.println(Arrays.toString(applyOperations(nums)));
    }

    public static int[] applyOperations(int[] nums) {

        int n = nums.length;
        
        for (int index = 0; index < n-1; index++) {
            if (nums[index]==nums[index+1] && nums[index]!=0){
                nums[index] *= 2;
                nums[index+1] = 0;
            }
        }
        
        int nonZero = 0;

        for (int index = 0; index < n; index++) {
            if (nums[index]!=0){
                nums[nonZero++] = nums[index];
            }
        }

        while(nonZero<n){
            nums[nonZero++] = 0;
        }

        return nums;
    }

}
