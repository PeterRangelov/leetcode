package easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class Pr40ClimbingStairsTest {

  private Pr40ClimbingStairs pr;

  private static Stream<Arguments> provideNumbers() {
    return Stream.of(
      Arguments.of(1, 1),
      Arguments.of(2, 2),
      Arguments.of(3, 3),
      Arguments.of(4, 5),
      Arguments.of(5, 8),
      Arguments.of(6, 13),
      Arguments.of(7, 21),
      Arguments.of(8, 34),
      Arguments.of(9, 55),
      Arguments.of(10, 89),
      Arguments.of(11, 144),
      Arguments.of(12, 233),
      Arguments.of(45, 1_836_311_903),
      Arguments.of(50, 20_365_011_074L),
      Arguments.of(60, 2_504_730_781_961L)
    );
  }

  @BeforeEach
  void setup() {
    pr = new Pr40ClimbingStairs();
  }

  @ParameterizedTest
  @MethodSource("provideNumbers")
  void testAll(int step, long waysToReach) {
    assertEquals(waysToReach, pr.climbStairs(step));
  }

}
