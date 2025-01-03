package leetCodeDaily;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Question_2554 {
    public static void main(String[] args) {

//        int [] banned = {1,6,5};
        int [] banned = {11};
        int n=7, maxSum = 50;

        Question_2554 que = new Question_2554();

        int result = que.maxCount(banned,n,maxSum);

        System.out.println(result);

    }

    public int maxCount(int[] banned, int n, int maxSum) {

        int count = 0, sum = 0;

        HashSet<Integer> allowedNumbers = new HashSet<>();

        for (int i = 0; i < n; i++) {
            allowedNumbers.add(i+1);
        }

        for(int num:banned){
            //remove banned numbers from the set instead of adding
           allowedNumbers.remove(num);
        }

//        System.out.println(set);

        for (int num: allowedNumbers) {
            if(sum+num<=maxSum){
                sum+=num;
                count++;
            }
        }

//        System.out.println(sum);
        return count;
    }

}
