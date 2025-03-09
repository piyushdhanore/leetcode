package leetCodeDailyVarients;

import java.util.Arrays;
import java.util.HashSet;

public class Question_2965_2 {
    public static void main(String[] args) {
//        int[][] nums = {{1,3},{2,2}};
//        int[][] nums = {{1,2},{4,4}};
        int[][] nums = {{9,1,7},{8,9,2},{3,4,6}};

        int [] res = findMissingAndRepeatedValues(nums);
        System.out.println(Arrays.toString(res));
    }
    public static int[] findMissingAndRepeatedValues(int[][] grid) {

        int count = 0, a, b, maxSum=0;

        HashSet<Integer> set = new HashSet<>();

        for (int[]num: grid){
            for (int n: num){
                count++;
                if (set.contains(n)) {
                    a = n;
                } else {
                    set.add(n);
                }

            }
        }
        System.out.println(count);
//        System.out.println(maxSum);

//        b =


        return new int[2];
    }

    public static int maxCount(){

        return 0;
    }
}
