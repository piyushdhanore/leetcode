package leetCodeDaily;
/*
    2965. Find Missing and Repeated Values
    You are given a 0-indexed 2D integer matrix grid of size n * n with values in the range [1, n2]. Each integer appears exactly once except a which appears twice and b which is missing. The task is to find the repeating and missing numbers a and b.

    Return a 0-indexed integer array ans of size 2 where ans[0] equals to a and ans[1] equals to b.

    Example 1:
    Input: grid = [[1,3],[2,2]]
    Output: [2,4]
    Explanation: Number 2 is repeated and number 4 is missing so the answer is [2,4].

    Example 2:
    Input: grid = [[9,1,7],[8,9,2],[3,4,6]]
    Output: [9,5]
    Explanation: Number 9 is repeated and number 5 is missing so the answer is [9,5].
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Question_2965 {
    public static void main(String[] args) {
//        int[][] nums = {{1,3},{2,2}};
//        int[][] nums = {{1,2},{4,4}};
        int[][] nums = {{9,1,7},{8,9,2},{3,4,6}};

        int [] res = findMissingAndRepeatedValues(nums);
        System.out.println(Arrays.toString(res));
    }
    public static int[] findMissingAndRepeatedValues(int[][] grid) {

        int [] res = new int[2];

        List<Integer> list = new ArrayList<>();

        for (int[] ints : grid) {
            for (int anInt : ints) {
                list.add(anInt);
            }
        }

//        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        int maxLength = list.size(), index=0;
        System.out.println(maxLength);

        for (int i = 0; i <list.size()-1; i++) {

            if (list.get(i).equals(list.get(i+1))) {
                res[0] = list.get(i);
            }
            if (!list.contains(i+1)) {
                res[1] = i + 1;
            } else if (!list.contains(maxLength)){
                res[1] = maxLength;
            }
        }

        return res;
    }
}
