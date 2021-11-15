package easy;

public class Pr1662TwoStrArrEquiv {

  public boolean arrayStringsAreEqual(String[] word1, String[] word2) {

    // first approach: use queue

    //    Queue<Character> q = new LinkedList();
    //
    //    for (String word : word1) {
    //      for (char letter : word.toCharArray()) {
    //        q.add(letter);
    //      }
    //    }
    //
    //    for (String word : word2) {
    //      for (char letter : word.toCharArray()) {
    //        if (q.isEmpty() || q.remove() != letter) {
    //          return false;
    //        }
    //      }
    //    }
    //
    //    return q.isEmpty();

    // second approach: use two letters pointers, two words pointers to simulate stream

    int idxWord1 = 0, idxWord2 = 0, idxLetter1 = 0, idxLetter2 = 0;

    while (idxWord1 < word1.length && idxWord2 < word2.length) {

      if (word1[idxWord1].charAt(idxLetter1) != word2[idxWord2].charAt(idxLetter2)) {
        return false;
      }

      // reached last letter of current word
      if (idxLetter1 == word1[idxWord1].length() - 1) {
        idxWord1++;
        idxLetter1 = 0;
      }
      else {
        idxLetter1++;
      }

      // reached last letter of current word
      if (idxLetter2 == word2[idxWord2].length() - 1) {
        idxWord2++;
        idxLetter2 = 0;
      }
      else {
        idxLetter2++;
      }

    }

    return idxWord1 == word1.length && idxWord2 == word2.length;

  }
}
