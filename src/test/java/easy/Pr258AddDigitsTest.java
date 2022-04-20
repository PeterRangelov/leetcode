package easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class Pr258AddDigitsTest {

  private Pr258AddDigits pr;

  private static Stream<Arguments> provideNums() {
    return Stream.of(
      Arguments.of(0, 0),
      Arguments.of(5, 5),
      Arguments.of(9, 9),
      Arguments.of(10, 1),
      Arguments.of(18, 9),
      Arguments.of(38, 2),
      Arguments.of(57, 3),
      Arguments.of(100, 1),
      Arguments.of(109, 1),
      Arguments.of(2_032_610_959, 1)
    );
  }

  private static Stream<Arguments> provideNumsSingle() {
    return Stream.of(
      Arguments.of(5, 5),
      Arguments.of(38, 11),
      Arguments.of(57, 12),
      Arguments.of(100, 1),
      Arguments.of(109, 10)
    );
  }

  private static Stream<Arguments> provideDivisors() {
    return Stream.of(
      Arguments.of(9, 1),
      Arguments.of(11, 10),
      Arguments.of(38, 10),
      Arguments.of(99, 10),
      Arguments.of(100, 100),
      Arguments.of(500, 100),
      Arguments.of(85_000, 10_000)
    );
  }

  @BeforeEach
  void setup() {
    pr = new Pr258AddDigits();
  }

  @ParameterizedTest
  @MethodSource("provideNums")
  void testAll(int num, int sum) {
    assertEquals(sum, pr.addDigits(num));
  }

  @ParameterizedTest
  @MethodSource("provideNumsSingle")
  void testSingleSum(int num, int sum) {
    assertEquals(sum, pr.sumOfDigitsOneRound(num));
  }

  @ParameterizedTest
  @MethodSource("provideDivisors")
  void testDivisor(int num, int divisor) {
    assertEquals(pr.getDivisor(num), divisor);
  }

}
