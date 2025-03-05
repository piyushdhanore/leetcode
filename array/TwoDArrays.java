package array;

import java.util.ArrayList;
import java.util.List;

public class TwoDArrays {
    public static void main(String[] args) {

        int [] n = {1,2,3};

        twoDArray(n);
    }

    public static void twoDArray(int[] nums){

        int output = 0;
        List<List<Integer>> lists = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            List<Integer> list = new ArrayList<>();
            int sum = 0;
            for (int j = 0; j <=i; j++) {
                list.add(nums[j]);
                sum+=nums[j];
            }
            lists.add(list);
            System.out.println(list + " -> Sum: " + sum);
        }



        for (List<Integer> i: lists){
            System.out.print(i);
        }
    }
}
