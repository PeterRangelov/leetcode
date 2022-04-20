package easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Pr383RansomNoteTest {
  private Pr1528ShuffleString pr;

  @BeforeEach
  void setup() {
    pr = new Pr1528ShuffleString();
  }

  @Test
  void test_leetcode() {
    assertEquals("leetcode",
      pr.restoreString("codeleet", new int[] {4, 5, 6, 7, 0, 2, 1, 3}));
  }

  @Test
  void test_abc() {
    assertEquals("abc",
      pr.restoreString("abc", new int[] {0, 1, 2}));
  }

  @Test
  void test_aaiougrt() {
    assertEquals("arigatou",
      pr.restoreString("aaiougrt", new int[] {4, 0, 2, 6, 7, 3, 1, 5}));
  }



}
