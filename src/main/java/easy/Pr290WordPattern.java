package easy;

import java.util.HashSet;
import java.util.Set;

public class Pr290WordPattern {

  public boolean wordPattern(String pattern, String s) {

    if (s == null || pattern == null) {
      return false;
    }

    String[] words = s.split(" ");

    // letters should equal words
    if (pattern.length() != words.length) {
      return false;
    }

    // approach 1: String array size 26 --> use index to be int value of char
    String[] wordMap = new String[26];
    Set<String> mappedWords = new HashSet<>();

    for (int i = 0; i < words.length; i++) {
      int mapIdx = pattern.charAt(i) - 'a';

      // first encounter with word
      if (wordMap[mapIdx] == null && !mappedWords.contains(words[i])) {
        wordMap[mapIdx] = words[i];
        mappedWords.add(words[i]);
        continue;
      }

      // previously mapped word to different letter
      if (wordMap[mapIdx] == null && mappedWords.contains(words[i])) {
        return false;
      }

      if (!wordMap[mapIdx].equals(words[i])) {
        return false;
      }

    }

    return true;

  }

}
