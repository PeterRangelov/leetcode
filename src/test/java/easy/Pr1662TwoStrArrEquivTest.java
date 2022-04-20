package easy;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Pr1662TwoStrArrEquivTest {

  private Pr1662TwoStrArrEquiv pr;

  @BeforeEach
  void setup() {
    pr = new Pr1662TwoStrArrEquiv();
  }

  @Test
  void test_A() {
    assertTrue(pr.arrayStringsAreEqual(
      new String[] {"ab", "c"},
      new String[] {"a", "bc"}));
  }

  @Test
  void test_B() {
    assertTrue(pr.arrayStringsAreEqual(
      new String[] {"ab", "c"},
      new String[] {"a", "bc"}));
  }

  @Test
  void test_C() {
    assertTrue(pr.arrayStringsAreEqual(
      new String[] {"ab", "c"},
      new String[] {"a", "bc"}));
  }

  @Test
  void test_D() {
    assertTrue(pr.arrayStringsAreEqual(
      new String[] {"abc", "d", "defg"},
      new String[] {"abcddefg"}));
  }

  @Test
  void test_DE() {
    assertFalse(pr.arrayStringsAreEqual(
      new String[] {"abc", "d", "defg"},
      new String[] {"abcddef"}));
  }
}
