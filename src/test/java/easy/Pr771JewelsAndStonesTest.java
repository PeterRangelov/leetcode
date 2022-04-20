package easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Pr771JewelsAndStonesTest {
  private Pr771JewelsAndStones pr;

  @BeforeEach
  void setup() {
    pr = new Pr771JewelsAndStones();
  }

  @Test
  void test_A() {
    assertEquals(3, pr.numJewelsInStones("aA", "aAAbbbb"));
  }

  @Test
  void test_C() {
    assertEquals(0, pr.numJewelsInStones("z", "ZZ"));
  }

}
