package leetCodeDailyVarients;

import java.util.ArrayList;
import java.util.List;

public class Question_1408_3 {
    public static void main(String[] args) {

//        String [] words = {"mass","as","hero","superhero"};
        String [] words = {"leetcode","et","code"};
//        String [] words = {"blue","green","bu"};
//        String [] words = {"leetcoder","leetcode","od","hamlet","am"};

        System.out.println(stringMatching(words));
    }

    public static List<String> stringMatching(String[] words) {

        List<String> list = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            if(findWord(i, words)) list.add(words[i]);
        }

        return list;
    }

    public static boolean findWord(int i, String[] words){

        for (int j = 0; j < words.length; j++) {
            if (i==j) continue;
            if (words[j].indexOf(words[i])!=-1) return true;
        }

        return false;

    }
}
