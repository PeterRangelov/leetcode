package easy;

import java.util.HashSet;
import java.util.Set;

public class Pr771JewelsAndStones {

  public int numJewelsInStones(String jewels, String stones) {

    // first approach: brute force

    //    int counter = 0;
    //
    //    for (char s : stones.toCharArray()) {
    //      for (char j : jewels.toCharArray()) {
    //        if (s == j) {
    //          counter++;
    //        }
    //      }
    //    }
    //
    //    return counter;


    // second approach: use hashset for O(1) lookup

    int counter = 0;

    Set<Character> jewelSet = new HashSet();

    for (char j : jewels.toCharArray()) {
      jewelSet.add(j);
    }

    for (char s : stones.toCharArray()) {
      if (jewelSet.contains(s))
        counter++;

    }


    return counter;
  }

}
