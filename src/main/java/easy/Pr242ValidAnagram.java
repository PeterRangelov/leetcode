package easy;

public class Pr242ValidAnagram {

  public boolean isAnagram(String s, String t) {

    if (s.length() != t.length()) {
      return false;
    }

    int[] letterCount = new int[26];

    for (char c : s.toCharArray()) {
      letterCount[c - 'a']++;
    }

    for (char c : t.toCharArray()) {
      letterCount[c - 'a']--;
      if (letterCount[c - 'a'] < 0) {
        return false;
      }
    }

    return true;

  }

}
