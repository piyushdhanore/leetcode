package leetCode.Array;

/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 */

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Problem_1 {
    public static void main(String[] args) {

//        int[]nums = {2,7,11,15};
//        int target = 9;

//        int[]nums = {3,2,4};
//        int target = 6;

//        int[]nums = {3,2,3};
//        int target = 6;

        int[]nums = {0,4,3,0};
        int target = 0;


//        System.out.println(Arrays.toString(twoSum_(nums,target)));
//        System.out.println(Arrays.toString(twoSum_1(nums,target)));
//        System.out.println(Arrays.toString(twoSum_2(nums,target)));
        System.out.println(Arrays.toString(twoSum_3(nums,target)));
    }

    public static int[] twoSum(int[] nums, int target) {

        int[] ans = new int[2];

        for (int i = 0; i < nums.length-1; i++) {

            for (int j = i+1; j < nums.length; j++) {
                if (nums[i]+nums[j]==target){
                    ans[0]=i;
                    ans[1]=j;
                }
            }
        }

        return ans;
    }

    public static int[] twoSum_1(int[] nums, int target) {

        int[] ans = new int[2];

        for (int i = 1; i < nums.length; i++) {
            if (nums[0] == target-nums[i]){
                ans[0] = 0;
                ans[1] = i;
            }
        }

        return ans;
    }

    public static int[] twoSum_2(int[] nums, int target) {

        int[] ans = new int[2];

        int key =0;

        for (int i = 0; i < nums.length; i++) {

            key = target - nums[i];

//            Arrays.sort(nums);

            int found = Arrays.binarySearch(nums,i+1,nums.length,key);

            if (found>i){
                ans[0]=i;
                ans[1]=found;
                return ans;
            }
        }

        return ans;

//        doesn't work since array needs to be sorted for binarySearch method
    }

    public static int[] twoSum_3(int[] nums, int target) {

        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],i);
        }

        System.out.println(map);

        for (int i = 0; i < nums.length; i++) {
            int complement = target -nums[i];
            if (map.containsKey(complement) && map.get(complement)!=i) {
                return new int[] {i,map.get(complement)};
            }
        }

        return new int[] {};
    }

    public static int[] twoSum_4(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        // Return an empty array if no solution is found
        return new int[] {};
    }

}
