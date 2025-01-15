package leetCodeDaily;

/*

    Given an array of string words, return all strings in words that is a substring of another word. You can return the answer in any order.

    A substring is a contiguous sequence of characters within a string

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

        String [] words = {"mass","as","hero","superhero"};

        System.out.println(stringMatching(words));
    }

    public static List<String> stringMatching(String[] words) {

        List<String> list = new ArrayList<>();

//        Set<String> set = new HashSet<>(Arrays.asList(words));

        for (int i = 0; i < words.length; i++) {

            Set<String> set = new HashSet<>();


        }


        return list;
    }
}
