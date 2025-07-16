package dailyLeetCode;

/*
3136. Valid Word

A word is considered valid if:

It contains a minimum of 3 characters.
It contains only digits (0-9), and English letters (uppercase and lowercase).
It includes at least one vowel.
It includes at least one consonant.
You are given a string word.

Return true if word is valid, otherwise, return false.

Notes:
'a', 'e', 'i', 'o', 'u', and their uppercases are vowels.
A consonant is an English letter that is not a vowel.


Example 1:
Input: word = "234Adas"
Output: true
Explanation:
This word satisfies the conditions.

Example 2:
Input: word = "b3"
Output: false
Explanation:
The length of this word is fewer than 3, and does not have a vowel.

Example 3:
Input: word = "a3$e"
Output: false
Explanation:
This word contains a '$' character and does not have a consonant.

Constraints:
1 <= word.length <= 20
word consists of English uppercase and lowercase letters, digits, '@', '#', and '$'.
 */

import java.util.HashSet;
import java.util.Set;

public class Question_3136 {
    public static void main(String[] args) {

//        String word = "234Adas";
//        String word = "b3";
        String word = "a3$e";

        if (isValid(word)) {
            System.out.println(word + " is valid");
        } else {
            System.out.println(word + " is not valid");
        }

    }

    public static boolean isValid(String word) {

        if (word.length() < 3) return false;

        boolean hasVowel = false;
        boolean hasConsonant = false;

        for (int i = 0; i < word.length(); i++) {

            switch (word.charAt(i)) {
                case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U':
                    hasVowel = true;
                    break;
                case 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y',
                     'z',
                     'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Y',
                     'Z':
                    hasConsonant = true;
                    break;
                case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9':
                    break;
                default:
                    return false;
            }

        }

        return hasVowel && hasConsonant;
    }

    public static boolean isValid0(String word) {

        if (word.length() < 3) return false;

        boolean hasVowel = false;
        boolean hasConsonant = false;

        for (int i = 0; i < word.length(); i++) {

            char ch = word.charAt(i);

            if (!Character.isLetterOrDigit(ch)) {
                return false;
            }

            if (Character.isLetter(ch)) {
                if ("aeiou".indexOf(Character.toLowerCase(ch)) >= 0) {
                    hasVowel = true;
                } else {
                    hasConsonant = true;
                }
            }
        }


        return hasVowel && hasConsonant;
    }

    public static boolean isValid1(String word) {

        if (word.length() < 3) return false;

        String vowels = "aeiouAEIOU";
        boolean hasVowel = false;
        boolean hasConsonant = false;

        for (int i = 0; i < word.length(); i++) {

            char ch = word.charAt(i);

            if (!Character.isLetterOrDigit(ch)) {
                return false;
            }

            if (Character.isLetter(ch)) {
                if (vowels.indexOf(ch) >= 0) {
                    hasVowel = true;
                } else {
                    hasConsonant = true;
                }
            }
        }

        return hasVowel && hasConsonant;
    }

    public static boolean isValid2(String word) {

        if (word.length() < 3) return false;

        Set<Character> vowels = Set.of('a', 'e', 'i', 'u', 'o', 'A', 'E', 'I', 'O', 'U');

        boolean hasVowel = false;
        boolean hasConsonant = false;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (!Character.isLetterOrDigit(ch)) {
                return false;
            }

            if (Character.isLetter(ch)) {
                if (vowels.contains(ch)) {
                    hasVowel = true;
                } else {
                    hasConsonant = true;
                }
            }

        }

        return hasVowel && hasConsonant;
    }

    public static boolean isValid3(String word) {

        if (word.length() < 3) return false;

        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');


        for (int i = 0; i < word.length(); i++) {

            char ch = word.charAt(i);
//            this if condition will always return false
//            if (!Character.isAlphabetic(ch) || !Character.isDigit(ch) || !vowels.contains(ch) ){
//                return false;
//            }
            if (!Character.isLetterOrDigit(ch)) {
                return false;
            }
            if (!vowels.contains(ch)) {
                return false;
            } else {
                return false;
            }
        }
        return true;
    }
}
