package leetCodeDaily;

/*
2523. Closest Prime Numbers in Range

Given two positive integers left and right, find the two integers num1 and num2 such that:
left <= num1 < num2 <= right .
Both num1 and num2 are prime numbers.
num2 - num1 is the minimum amongst all other pairs satisfying the above conditions.
Return the positive integer array ans = [num1, num2]. If there are multiple pairs satisfying
these conditions, return the one with the smallest num1 value. If no such numbers exist, return [-1, -1].

Example 1:
Input: left = 10, right = 19
Output: [11,13]
Explanation: The prime numbers between 10 and 19 are 11, 13, 17, and 19.
The closest gap between any pair is 2, which can be achieved by [11,13] or [17,19].
Since 11 is smaller than 17, we return the first pair.

Example 2:
Input: left = 4, right = 6
Output: [-1,-1]
Explanation: There exists only one prime number in the given range, so the conditions cannot be satisfied.

 */

import java.util.ArrayList;
import java.util.Arrays;

public class Question_2523 {
    public static void main(String[] args) {

//        int left = 10, right = 19;
        int left = 19, right = 31;
//        int left = 4, right = 6;

        System.out.println(Arrays.toString(closestPrimes(left, right)));

    }

    public static int[] closestPrimes(int left, int right) {

        ArrayList<Integer> list = new ArrayList<>();

        while(left<=right){
            if(isPrime(left)) list.add(left);
            left++;
        }

        if(list.isEmpty() || list.size()<2) return new int[]{-1, -1};

        System.out.println(list);
//        lowest(list);

        return lowest(list);
    }

    public static boolean isPrime(int n){

        for (int i = 2; i <=n/2; i++) if (n % i == 0) return false;

        return true;
    }

    public static int[] lowest(ArrayList<Integer> list){

        int [] arr = new int[2];

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int i = 0; i < list.size()-1; i++) {

            if (list.get(i+1)-list.get(i)< min1){
                arr[0] = list.get(i);
                arr[1] = list.get(i+1);
                min1 = list.get(i+1)-list.get(i);
                min2 = list.get(i+1)+list.get(i);
            } else if (list.get(i+1)-list.get(i) == min1 && list.get(i+1)+list.get(i)<min2) {
                arr[0] = list.get(i);
                arr[1] = list.get(i+1);
                min1 = list.get(i+1)-list.get(i);
                min2 = list.get(i+1)+list.get(i);
            }
        }
        return arr;
    }
}
