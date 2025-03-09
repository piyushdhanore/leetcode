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

//        int [] nums = {21,4,7};
//        int [] nums = {21,21};
//        int [] nums = {1,2,3,4,5};
        int [] nums = {1,2,3,4,5,6,7,8,9,10};

        System.out.println(sumFourDivisors(nums));
    }

//    public static int sumFourDivisors(int[] nums) {
//
//        long output = 0;
//
//        for(int div: nums) {
//
//            int out =0, divisors = 1;
//
//            for (int i = 1; i <=div/2; i++) {
//
//                if (div%i==0) {
//                    out+=i;
//                    divisors++;
//                }
//            }
//
//            if (divisors==4){
//                output+=(out+div);
//            }
//        }
//
//
//
//        return output;
//    }

    public static int sumFourDivisors(int[] nums) {

        int totalSum = 0;

        for(int num : nums) {

            int sum =0, count = 0;

            for (int i = 1; i*i <= num; i++) {

                if (num %i==0) {
                   count++;
                   sum+=i;
                   if (i!=num/i){
                       count++;
                       sum+=num/i;
                   }
                }
                if (count>4) break;
            }

            if (count ==4){
                totalSum +=sum;
            }
        }



        return totalSum;
    }

//    public static int factors()
}
