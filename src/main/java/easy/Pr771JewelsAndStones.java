package easy;

import java.util.HashSet;
import java.util.Set;

/**
 * This class provides a solution to the problem of counting the number of jewels
 * in a given collection of stones. Jewels are represented by characters, and
 * stones are also represented by characters.
 */
public class Pr771JewelsAndStones {

  /**
   * Counts how many stones are jewels.
   *
   * @param jewels a string representing the types of jewels, each character
   *               represents a unique type of jewel.
   * @param stones a string representing the stones, where each character
   *               represents a type of stone.
   * @return the number of stones that are also jewels.
   */
  public int numJewelsInStones(String jewels, String stones) {
    // Second approach: use a HashSet for O(1) lookup of jewels
    int counter = 0;

    // Create a set to store jewel types for fast lookup
    Set<Character> jewelSet = new HashSet<>();

    // Add each jewel to the set
    for (char j : jewels.toCharArray()) {
      jewelSet.add(j);
    }

    // Iterate over stones and count how many are jewels
    for (char s : stones.toCharArray()) {
      if (jewelSet.contains(s)) {
        counter++;
      }
    }

    return counter; // Return the total count of jewels found in stones
  }
}