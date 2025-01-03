package leetCodeDaily;

import java.util.HashSet;
import java.util.Set;

public class Question_1684 {

    public static void main(String[] args) {

        String allowed = "ab";
        String[] words = {"ad","bd","aaab","baa","badab"};

        int output = countConsistentStrings(allowed, words);

        System.out.println(output);
    }

    public static int countConsistentStrings(String allowed, String[] words) {

        // Convert the allowed string to a set of characters for efficient lookup
        Set<Character> allowedSet = new HashSet<>();
        for (char c : allowed.toCharArray()) {
            allowedSet.add(c);
        }

        int count = 0;

        // Iterate over each word in the words array
        for (String word : words) {
            boolean isConsistent = true;

            // Check if all characters in the word are in the allowed set
            for (char c : word.toCharArray()) {
                if (!allowedSet.contains(c)) {
                    isConsistent = false;
                    break; // No need to check further if any character is inconsistent
                }
            }

            // If the word is consistent, increment the count
            if (isConsistent) {
                count++;
            }
        }

        return count;
    }
}
