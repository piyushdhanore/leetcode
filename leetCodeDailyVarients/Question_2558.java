package leetCodeDailyVarients;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class Question_2558 {

    public static void main(String[] args) {
        int[] gifts = {25,64,9,4,100};
        int k =4;
        long result = pickGifts(gifts, k);
        System.out.println(result);
    }

    public static long pickGifts(int[] gifts, int k) {
        long sum =0;

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for(int arr: gifts){
            maxHeap.add(arr);
        }

        for(int i=0;i<k;i++){
            int temp = maxHeap.poll();
            maxHeap.add((int)Math.sqrt(temp));
        }

//        System.out.println(maxHeap);

        while(!maxHeap.isEmpty()){
            sum+=maxHeap.poll();
        }

        return sum;
    }

}
