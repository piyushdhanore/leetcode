package leetCodeDaily;

/*
3306. Count of Substrings Containing Every Vowel and K Consonants II
You are given a string word and a non-negative integer k.
Return the total number of substrings of word that contain every
vowel ('a', 'e', 'i', 'o', and 'u') at least once and exactly k consonants.



Example 1:
Input: word = "aeioqq", k = 1
Output: 0
Explanation: There is no substring with every vowel.

Example 2:
Input: word = "aeiou", k = 0
Output: 1
Explanation: The only substring with every vowel and zero consonants is word[0..4], which is "aeiou".

Example 3:
Input: word = "ieaouqqieaouqq", k = 1
Output: 3
Explanation: The substrings with every vowel and one consonant are:
word[0..5], which is "ieaouq".
word[6..11], which is "qieaou".
word[7..12], which is "ieaouq".
 */

import java.util.HashSet;
import java.util.Set;

public class Question_3306 {
    public static void main(String[] args) {

//        String word = "aeioqq"; int k = 1;
            String word = "aeiou"; int k = 0;
//        String word = "ieaouqqieaouqq"; int k =1;

            System.out.println(countOfSubstrings(word,k));;
    }

    public static long countOfSubstrings(String word, int k) {

        int limit = 5;
        Set<Character> set = Set.of('a', 'e', 'i', 'o', 'u');

        for (int i = 0; i < word.length(); i++) {
            String out = word.substring(i,limit);
        }

        return 0;
    }
}
