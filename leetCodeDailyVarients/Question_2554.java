package leetCodeDailyVarients;

import java.util.HashSet;

public class Question_2554 {
    public static void main(String[] args) {

//        int [] banned = {1,6,5}; int n=5, maxSum =6;
//        int [] banned = {11}; int n=7, maxSum = 50;
        int [] banned = {1,2,3,4,5,6,7}; int n=8, maxSum = 1;

        leetCodeDaily.Question_2554 que = new leetCodeDaily.Question_2554();

        int result = que.maxCount(banned,n,maxSum);

        System.out.println(result);

    }

    public int maxCount(int[] banned, int n, int maxSum) {
        int count = 0, sum = 0;

        HashSet<Integer> allowedNumbers = new HashSet<>();

        for(int num:banned){
            allowedNumbers.add(num);
        }

        for(int num=1;num<=n;num++){
            if(!allowedNumbers.contains(num) && sum+num<=maxSum){
                count++;
                sum+=num;
            }
        }

        return count;
    }
}
