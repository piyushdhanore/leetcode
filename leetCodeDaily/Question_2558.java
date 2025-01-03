package leetCodeDaily;

import java.util.Arrays;

public class Question_2558 {
    public static void main(String[] args) {

        int[] gifts = {25,64,9,4,100};
        int k =4;
        long result = pickGifts(gifts, k);
        System.out.println(result);
    }

    public static long pickGifts(int[] gifts, int k) {

        for (int i = 0; i < k; i++) {

            Arrays.sort(gifts);
            gifts[gifts.length-1] = (int) Math.sqrt(gifts[gifts.length-1]);
        }

        long sum = 0;
        for (int i = 0; i < gifts.length; i++) {
            sum+=gifts[i];
        }

        return sum;
    }
}
