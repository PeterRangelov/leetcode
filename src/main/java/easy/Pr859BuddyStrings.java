package easy;

public class Pr859BuddyStrings {

  public boolean buddyStrings(String s, String goal) {

    if (s == null || goal == null || s.length() != goal.length() || s.length() == 1) {
      return false;
    }

    // use two frequency maps?

    Character firstDiff = null;
    boolean twoIdenticalLetters = false;
    int[] frequencyDist = new int[26];
    final int a = 'a';
    int differenceInLetters = 0;

    for (int i = 0; i < s.length(); i++) {

      differenceInLetters += (s.charAt(i) - goal.charAt(i));

      if (!twoIdenticalLetters && frequencyDist[s.charAt(i) - a] == 1) {
        twoIdenticalLetters = true;
      }
      else {
        frequencyDist[s.charAt(i) - a]++;
      }

      // if they're the same letter, continue. we only care about differences
      if (s.charAt(i) == goal.charAt(i)) {
        continue;
      }

      if (firstDiff == null) {
        firstDiff = s.charAt(i);
        continue;
      }

      if (goal.charAt(i) != firstDiff) {
        return false;
      }

    }

    // identical letters in both strings however s contains repeating letters
    // or we found a difference but even tho difference exists letter sums are identical
    return (firstDiff == null && twoIdenticalLetters) ||
      (firstDiff != null && differenceInLetters == 0);

  }

}
