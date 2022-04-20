package easy;

import static org.junit.Assert.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class Pr746MinCostClimbStairsTest {

  private Pr746MinCostClimbStairs pr;

  private static Stream<Arguments> provideNumbers() {
    return Stream.of(
      Arguments.of(new int[] {10, 15, 20}, 15),
      Arguments.of(new int[] {1, 100, 1, 1, 1, 100, 1, 1, 100, 1}, 6)
    );
  }

  @BeforeEach
  void setup() {
    pr = new Pr746MinCostClimbStairs();
  }

  @ParameterizedTest
  @MethodSource("provideNumbers")
  void testAll(int[] steps, int minCost) {
    assertEquals(minCost, pr.minCostClimbingStairs(steps));
  }

}
