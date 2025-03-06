package leetCode.Array;
/*
1390. Four Divisors
Given an integer array nums, return the sum of divisors of the integers in that array that have exactly
four divisors. If there is no such integer in the array, return 0.

Example 1:
Input: nums = [21,4,7]
Output: 32
Explanation:
21 has 4 divisors: 1, 3, 7, 21
4 has 3 divisors: 1, 2, 4
7 has 2 divisors: 1, 7
The answer is the sum of divisors of 21 only.

Example 2:
Input: nums = [21,21]
Output: 64

Example 3:
Input: nums = [1,2,3,4,5]
Output: 0
 */

public class Question_1390 {
    public static void main(String[] args) {

        int [] nums = {21,4,7};

        System.out.println(sumFourDivisors(nums));
    }

    public static int sumFourDivisors(int[] nums) {

        for(int div: nums) {

        }

        return 0;
    }
}
