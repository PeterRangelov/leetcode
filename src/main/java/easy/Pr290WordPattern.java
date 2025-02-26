package easy;

import java.util.HashSet;
import java.util.Set;

/**
 * This class provides a solution to LeetCode Problem 290: Word Pattern.
 * It checks if a given string follows a specific pattern of letters.
 */
public class Pr290WordPattern {

  /**
   * Checks if the string `s` follows the pattern defined by `pattern`.
   *
   * @param pattern the pattern string consisting of lowercase letters
   * @param s the string to check against the pattern
   * @return true if `s` follows the pattern, false otherwise
   */
  public boolean wordPattern(String pattern, String s) {

    // Return false if either string is null
    if (s == null || pattern == null) {
      return false;
    }

    String[] words = s.split(" "); // Split the string into words

    // Check if the number of letters in the pattern equals the number of words
    if (pattern.length() != words.length) {
      return false;
    }

    // Approach 1: Use an array to map characters to words
    String[] wordMap = new String[26]; // Array to hold mappings of letters to words
    Set<String> mappedWords = new HashSet<>(); // Set to track words that have been mapped

    // Iterate through the characters in the pattern and corresponding words
    for (int i = 0; i < words.length; i++) {
      int mapIdx = pattern.charAt(i) - 'a'; // Calculate the index for the character

      // First encounter with this pattern character
      if (wordMap[mapIdx] == null && !mappedWords.contains(words[i])) {
        wordMap[mapIdx] = words[i]; // Map the character to the current word
        mappedWords.add(words[i]); // Add the word to the set of mapped words
        continue;
      }

      // If the character has not been mapped but the word is already mapped
      if (wordMap[mapIdx] == null && mappedWords.contains(words[i])) {
        return false; // Invalid mapping
      }

      // Check if the current word matches the previously mapped word for this character
      if (!wordMap[mapIdx].equals(words[i])) {
        return false; // Invalid mapping
      }
    }

    return true; // All characters matched the corresponding words
  }
}