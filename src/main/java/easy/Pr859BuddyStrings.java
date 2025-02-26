package easy;

/**
 * This class provides a solution to the Buddy Strings problem, which checks
 * if two strings can be made equal by swapping exactly one pair of letters
 * in one of the strings.
 */
public class Pr859BuddyStrings {

  /**
   * Determines if two strings can become equal by swapping exactly one pair
   * of letters in one of the strings.
   *
   * @param s the first string
   * @param goal the second string
   * @return true if the strings can be made equal by swapping one pair of letters;
   *         false otherwise.
   */
  public boolean buddyStrings(String s, String goal) {

    // Check for null strings, length mismatch, or single character strings
    if (s == null || goal == null || s.length() != goal.length() || s.length() == 1) {
      return false;
    }

    Character firstDiff = null; // First differing character
    boolean twoIdenticalLetters = false; // Flag to track identical letters
    int[] frequencyDist = new int[26]; // Frequency distribution of characters
    final int a = 'a'; // Base value for character indexing
    int differenceInLetters = 0; // Track cumulative differences in characters

    // Iterate through both strings to find differences and character frequencies
    for (int i = 0; i < s.length(); i++) {
      differenceInLetters += (s.charAt(i) - goal.charAt(i));

      // Check for identical letters in string s
      if (!twoIdenticalLetters && frequencyDist[s.charAt(i) - a] == 1) {
        twoIdenticalLetters = true;
      } else {
        frequencyDist[s.charAt(i) - a]++;
      }

      // Continue if characters are the same
      if (s.charAt(i) == goal.charAt(i)) {
        continue;
      }

      // Store the first differing character
      if (firstDiff == null) {
        firstDiff = s.charAt(i);
        continue;
      }

      // Check if the second differing character matches the first
      if (goal.charAt(i) != firstDiff) {
        return false;
      }
    }

    // Return true if either both strings are identical with repeating letters
    // or if we found a difference with identical character sums
    return (firstDiff == null && twoIdenticalLetters) ||
            (firstDiff != null && differenceInLetters == 0);
  }
}