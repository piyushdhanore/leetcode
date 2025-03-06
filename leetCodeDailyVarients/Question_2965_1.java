package leetCodeDailyVarients;

import java.util.Arrays;
import java.util.HashSet;

public class Question_2965_1 {
    public static void main(String[] args) {
//        int[][] nums = {{1,3},{2,2}};
//        int[][] nums = {{1,2},{4,4}};
        int[][] nums = {{9,1,7},{8,9,2},{3,4,6}};

        int [] res = findMissingAndRepeatedValues(nums);
        System.out.println(Arrays.toString(res));
    }
    public static int[] findMissingAndRepeatedValues(int[][] grid) {

        int count = 0, a,b, maxSum=0;

        int[] arr = new int[2];

        HashSet<Integer> set = new HashSet<>();

//        for(int[] nums : grid){
//            for (int n: nums) ct++;
//        }
//        System.out.println("og count: "+ct);

        for (int i=0; i< grid.length; i++) {
            for (int j = 0; j <grid[i].length; j++) {
                if (set.contains(grid[i][j])) {
                    a = grid[i][j];
                } else {
                    set.add(grid[i][j]);
                }
                count++;
            }
            maxSum += count;
        }


        System.out.println(count);
        System.out.println(maxSum);

        System.out.println(set);



//        return new int[]{a,b};
        return arr;
    }

}
