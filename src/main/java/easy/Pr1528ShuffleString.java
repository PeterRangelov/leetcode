package easy;

public class Pr1528ShuffleString {

  public String restoreString(String s, int[] indices) {

    char[] shuffled = s.toCharArray();
    char[] restored = new char[indices.length];

    for (int i = 0; i <= indices.length - 1; i++) {
      restored[indices[i]] = shuffled[i];
    }

    return String.valueOf(restored);

  }

}
