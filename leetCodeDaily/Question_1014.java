package leetCodeDaily;

import java.util.ArrayList;
import java.util.List;

public class Question_1014 {

    public static void main(String[] args) {

        int [] values = {8,1,5,2,6};

        System.out.println("The maximum score is: "+maxScoreSightseeingPair(values));
    }

    public static int maxScoreSightseeingPair(int[] values) {

        int score = 0;

        List<Integer> list = new ArrayList<>();

        for (int i = 0,j=1; j < values.length ; j++) {

            list.add(values[i]+values[j]+i-j);
        }

        System.out.println(list);

        for (int num: list) if (num>score) score=num;

        return score;
    }

}
