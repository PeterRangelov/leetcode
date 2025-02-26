package easy;

/**
 * This class provides a solution for the Shuffle String problem, which
 * involves restoring a shuffled string based on given indices.
 */
public class Pr1528ShuffleString {

  /**
   * Restores a string based on the provided indices that indicate
   * the original positions of characters in the shuffled string.
   *
   * @param s the shuffled string to restore
   * @param indices an array of integers representing the original positions of the characters
   * @return the restored string in its original order
   */
  public String restoreString(String s, int[] indices) {

    // Convert the input string to a character array for manipulation
    char[] shuffled = s.toCharArray();
    char[] restored = new char[indices.length]; // Array to hold the restored characters

    // Iterate through the indices to place each character in its original position
    for (int i = 0; i <= indices.length - 1; i++) {
      restored[indices[i]] = shuffled[i]; // Place the character at its correct index
    }

    // Convert the restored character array back to a string and return it
    return String.valueOf(restored);
  }
}