package easy;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Pr1528ShuffleStringTest {
  private Pr383RansomNote pr;

  @BeforeEach
  void setup() {
    pr = new Pr383RansomNote();
  }

  @Test
  void test_A_B() {
    assertFalse(pr.canConstruct("a", "b"));
  }

  @Test
  void test_AA_AB() {
    assertFalse(pr.canConstruct("aa", "ab"));
  }

  @Test
  void test_AA_AAB() {
    assertTrue(pr.canConstruct("aa", "aab"));
  }

}
