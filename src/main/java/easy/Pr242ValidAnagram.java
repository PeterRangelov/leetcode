package easy;

/**
 * This class provides a solution to LeetCode Problem 242: Valid Anagram.
 * It contains a method to determine if two strings are anagrams of each other.
 */
public class Pr242ValidAnagram {

  /**
   * Checks if the given strings s and t are anagrams of each other.
   *
   * @param s the first string
   * @param t the second string
   * @return true if s and t are anagrams, false otherwise
   */
  public boolean isAnagram(String s, String t) {

    // If the lengths of the strings are not equal, they cannot be anagrams
    if (s.length() != t.length()) {
      return false;
    }

    // Array to count occurrences of each letter (a-z)
    int[] letterCount = new int[26];

    // Count the occurrences of each character in the first string
    for (char c : s.toCharArray()) {
      letterCount[c - 'a']++;
    }

    // Decrease the count for each character found in the second string
    for (char c : t.toCharArray()) {
      letterCount[c - 'a']--;
      // If the count drops below zero, t has more of this character than s
      if (letterCount[c - 'a'] < 0) {
        return false;
      }
    }

    // If we haven't returned false by now, s and t are anagrams
    return true;
  }
}