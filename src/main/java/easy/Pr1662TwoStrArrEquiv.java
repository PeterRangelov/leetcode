package easy;

/**
 * This class provides a solution for the Two String Array Equivalent problem,
 * which checks if two string arrays represent the same string when concatenated.
 */
public class Pr1662TwoStrArrEquiv {

  /**
   * Determines if two string arrays are equivalent by checking if their
   * concatenated strings are equal.
   *
   * @param word1 the first string array
   * @param word2 the second string array
   * @return true if the two arrays are equivalent, false otherwise
   */
  public boolean arrayStringsAreEqual(String[] word1, String[] word2) {

    // Use two letter pointers and two word pointers to simulate streaming
    int idxWord1 = 0, idxWord2 = 0;
    int idxLetter1 = 0, idxLetter2 = 0;

    while (idxWord1 < word1.length && idxWord2 < word2.length) {
      // Compare current characters from both arrays
      if (word1[idxWord1].charAt(idxLetter1) != word2[idxWord2].charAt(idxLetter2)) {
        return false; // Characters do not match
      }

      // Reached the last letter of the current word in word1
      if (idxLetter1 == word1[idxWord1].length() - 1) {
        idxWord1++; // Move to the next word in word1
        idxLetter1 = 0; // Reset letter index
      } else {
        idxLetter1++; // Move to the next letter in the current word
      }

      // Reached the last letter of the current word in word2
      if (idxLetter2 == word2[idxWord2].length() - 1) {
        idxWord2++; // Move to the next word in word2
        idxLetter2 = 0; // Reset letter index
      } else {
        idxLetter2++; // Move to the next letter in the current word
      }
    }

    // Ensure both word arrays are fully traversed
    return idxWord1 == word1.length && idxWord2 == word2.length;
  }
}