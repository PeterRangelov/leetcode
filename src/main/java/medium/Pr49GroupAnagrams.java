package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * LeetCode Problem 49: Group Anagrams
 *
 * This class provides a solution for grouping anagrams from a list of strings.
 * Anagrams are words that have the same characters in a different order.
 * The algorithm uses a frequency-based approach to group anagrams together.
 */
public class Pr49GroupAnagrams {

  /**
   * Groups anagrams from the given array of strings.
   *
   * @param strs an array of strings
   * @return a list of lists, where each inner list contains anagrams
   */
  public List<List<String>> groupAnagrams(String[] strs) {

    if (strs == null) {
      return new ArrayList<>(); // Return an empty list if the input is null
    }

    Map<String, List<String>> map = new HashMap<>(); // Map to store grouped anagrams

    for (String s : strs) {
      String freq = getLetterFreq(s); // Get the frequency representation of the string

      if (map.containsKey(freq)) {
        // If the frequency already exists, add the current string to the existing list
        List<String> anagrams = new ArrayList<>(map.get(freq));
        anagrams.add(s);
        map.replace(freq, anagrams); // Update the map with the new list
      } else {
        // If the frequency does not exist, create a new entry in the map
        map.put(freq, new ArrayList<>(List.of(s))); // Store the current string in a new list
      }
    }

    return new ArrayList<>(map.values()); // Return all grouped anagrams as a list
  }

  /**
   * Generates a string representation of the frequency of each character in the input string.
   *
   * @param s the input string
   * @return a string representation of the character frequency
   */
  private String getLetterFreq(String s) {
    int[] freq = new int[26]; // Frequency array for each letter (a-z)
    Arrays.fill(freq, 0); // Initialize frequency array to zero

    for (char c : s.toCharArray()) {
      freq[c - 'a']++; // Increment the frequency for the character
    }
    return Arrays.toString(freq); // Return the frequency array as a string
  }
}