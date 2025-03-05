package leetCode.Strings;

/*
    String Matching in an Array
    Given an array of string words, return all strings in words that are a substring of another word. You can return the answer in any order.

    Example 1:
    Input: words = ["mass","as","hero","superhero"]
    Output: ["as","hero"]
    Explanation: "as" is substring of "mass" and "hero" is substring of "superhero".
    ["hero","as"] is also a valid answer.

    Example 2:
    Input: words = ["leetcode","et","code"]
    Output: ["et","code"]
    Explanation: "et", "code" are substring of "leetcode".

    Example 3:
    Input: words = ["blue","green","bu"]
    Output: []
    Explanation: No string of words is substring of another string.
 */

import java.util.*;

public class Question_1408 {
    public static void main(String[] args) {

//        String [] words = {"mass","as","hero","superhero"};
//        String [] words = {"leetcode","et","code"};
//        String [] words = {"blue","green","bu"};
        String [] words = {"leetcoder","leetcode","od","hamlet","am"};

        System.out.println(stringMatching(words));
    }


    public static List<String> stringMatching(String[] words) {

        List<String> list = new ArrayList<>(Arrays.asList(words));
        Set<String> set = new HashSet<>();

        System.out.println(list);

        for (String word : words) {
            for (String s : list) {
                if (s.contains(word) && !s.equalsIgnoreCase(word)) {
                    set.add(word);
                }
            }
        }

//        System.out.println(lists);

        return new ArrayList<>(set);
    }
}
