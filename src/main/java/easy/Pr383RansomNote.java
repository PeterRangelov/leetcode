package easy;

/**
 * This class provides a solution to LeetCode Problem 383: Ransom Note.
 * It checks if the ransom note can be constructed from the letters in the magazine.
 */
public class Pr383RansomNote {

  /**
   * Checks if the ransom note can be constructed from the given magazine.
   *
   * @param ransomNote the note that needs to be constructed
   * @param magazine   the source of letters
   * @return true if the ransom note can be constructed, false otherwise
   */
  public boolean canConstruct(String ransomNote, String magazine) {

    // If the ransom note is longer than the magazine, it's impossible to construct
    if (ransomNote.length() > magazine.length()) {
      return false;
    }

    // Array to count the frequency of each letter in the magazine
    int[] lettersFreqInMagazine = new int[26];

    final int a = 'a'; // ASCII value of 'a'

    // Count the frequency of each letter in the magazine
    for (char m : magazine.toCharArray()) {
      lettersFreqInMagazine[m - a]++;
    }

    // Check if each letter in the ransom note can be matched
    for (char n : ransomNote.toCharArray()) {
      lettersFreqInMagazine[n - a]--; // Decrease the count for the letter used
      // If any letter count goes below zero, we can't construct the note
      if (lettersFreqInMagazine[n - a] < 0) {
        return false;
      }
    }

    // If all letters in the ransom note can be matched with those in the magazine
    return true;
  }
}