package easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class Pr231PowerOfTwoTest {

  private Pr231PowerOfTwo pr;

  private static Stream<Arguments> provideNumbers() {
    return Stream.of(
      Arguments.of(256, true),
      Arguments.of(1024, true),
      Arguments.of(2, true),
      Arguments.of(0, false),
      Arguments.of(1, true),
      Arguments.of(-1, false),
      Arguments.of(16, true),
      Arguments.of(5, false),
      Arguments.of(-17, false),
      Arguments.of(-9, false),
      Arguments.of(257, false),
      Arguments.of(16_385, false),
      Arguments.of(536_870_912, true),
      Arguments.of(Integer.MAX_VALUE, false)
    );
  }

  @BeforeEach
  void setup() {
    pr = new Pr231PowerOfTwo();
  }

  @ParameterizedTest
  @MethodSource("provideNumbers")
  void testAll(int num, boolean isPowerTwo) {
    assertEquals(isPowerTwo, pr.isPowerOfTwo(num));
  }

}
