package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Pr49GroupAnagrams {

  public List<List<String>> groupAnagrams(String[] strs) {

    if (strs == null) {
      return new ArrayList<>();
    }

    Map<String, List<String>> map = new HashMap<>();

    for (String s : strs) {

      String freq = getLetterFreq(s);

      if (map.containsKey(freq)) {
        List<String> anagrams = new ArrayList<>(map.get(freq));
        anagrams.add(s);
        map.replace(freq, anagrams);
      }
      else {
        map.put(freq, List.of(s));
      }
    }

    return new ArrayList<>(map.values());

  }

  private String getLetterFreq(String s) {
    int[] freq = new int[26];
    Arrays.fill(freq, 0);

    for (char c : s.toCharArray()) {
      freq[c - 'a']++;
    }
    return Arrays.toString(freq);
  }

}
