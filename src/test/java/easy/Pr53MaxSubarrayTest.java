package easy;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class Pr53MaxSubarrayTest {
  private Pr53MaxSubarray pr;

  @BeforeEach
  void setup() {
    pr = new Pr53MaxSubarray();
  }

  private static Stream<Arguments> provideData() {
    return Stream.of(
      Arguments.of(new int[] {1}, 1),
      Arguments.of(new int[] {5, 4, -1, 7, 8}, 23),
      Arguments.of(new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4}, 6),
      Arguments.of(new int[] {-4, -3, -2}, -2),
      Arguments.of(new int[] {-2, -3, -4}, -2)
    );

  }

  @ParameterizedTest
  @MethodSource("provideData")
  void testAll(int[] arr, int maxSum) {
    Assertions.assertEquals(maxSum, pr.maxSubArray(arr));
  }

}
