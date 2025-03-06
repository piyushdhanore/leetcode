package leetCodeDailyVarients;

import java.util.ArrayList;
import java.util.List;

public class Question_1408_1 {
    public static void main(String[] args) {

//        String [] words = {"mass","as","hero","superhero"};
//        String [] words = {"leetcode","et","code"};
//        String [] words = {"blue","green","bu"};
        String [] words = {"leetcoder","leetcode","od","hamlet","am"};

        System.out.println(stringMatching(words));
    }

    public static List<String> stringMatching(String[] words) {

        int wordLen = words.length;

        List<String> list = new ArrayList<>();

        for (int i = 0; i < wordLen; i++) {
            for (int j = 0; j < wordLen; j++) {
                if (i!=j && words[i].contains(words[j])){
                    if(!list.contains(words[j])){
                        list.add(words[i]);
                    }
                }
            }
        }

        return list;
    }
}
