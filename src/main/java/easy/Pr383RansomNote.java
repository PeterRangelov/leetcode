package easy;

public class Pr383RansomNote {

  public boolean canConstruct(String ransomNote, String magazine) {

    if (ransomNote.length() > magazine.length()) {
      return false;
    }

    int[] lettersFreqInMagazine = new int[26];

    final int a = 'a';

    for (char m : magazine.toCharArray()) {
      lettersFreqInMagazine[m - a]++;
    }

    for (char n : ransomNote.toCharArray()) {
      lettersFreqInMagazine[n - a]--;
      if (lettersFreqInMagazine[n - a] < 0) {
        return false;
      }
    }

    return true;

  }

}
