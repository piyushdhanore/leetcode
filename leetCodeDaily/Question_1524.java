package leetCodeDaily;

/*
    Number of Sub-arrays With Odd Sum
    Given an array of integers arr, return the number of subarrays with an odd sum.

    Since the answer can be very large, return it modulo 109 + 7.

    Example 1:
    Input: arr = [1,3,5]
    Output: 4
    Explanation: All subarrays are [[1],[1,3],[1,3,5],[3],[3,5],[5]]
    All sub-arrays sum are [1,4,9,3,8,5].
    Odd sums are [1,9,3,5] so the answer is 4.

    Example 2:
    Input: arr = [2,4,6]
    Output: 0
    Explanation: All subarrays are [[2],[2,4],[2,4,6],[4],[4,6],[6]]
    All sub-arrays sum are [2,6,12,4,10,6].
    All sub-arrays have even sum and the answer is 0.

    Example 3:
    Input: arr = [1,2,3,4,5,6,7]
    Output: 16
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Question_1524 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int [] arr = new int[size];

        System.out.println("Enter the elements of the array: ");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Given array is: "+Arrays.toString(arr));

        System.out.println("Total number of odd pairs are: "+numOfSubarrays(arr));
    }

    public static int numOfSubarrays(int[] arr) {

        int output = 0;

        List<List<Integer>> lists = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                List<Integer> list = new ArrayList<>();
                int sum = 0;
                for (int k = i; k <=j; k++) {
                    list.add(arr[k]);
                    sum+=arr[k];
                }
                if (sum%2!=0) {
                    output++;
                }
                lists.add(list);
            }

        }

        for (List i : lists){
            System.out.println(i);
        }

        return output;
    }
}
