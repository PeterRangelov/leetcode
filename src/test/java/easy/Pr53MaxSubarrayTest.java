package easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Pr53MaxSubarrayTest {
  Pr53MaxSubarray pr;

  @BeforeEach
  void setup() {
    pr = new Pr53MaxSubarray();
  }

  @Test
  void test_A() {
    assertEquals(1, pr.maxSubArray(new int[] {1}));
  }

  @Test
  void test_B() {
    assertEquals(23, pr.maxSubArray(new int[] {5, 4, -1, 7, 8}));
  }

  @Test
  void test_C() {
    assertEquals(6, pr.maxSubArray(new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4}));
  }

}
