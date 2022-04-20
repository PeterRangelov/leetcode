package easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class Pr342PowerOfFourTest {

  private Pr342PowerOfFour pr;

  private static Stream<Arguments> provideNums() {
    return Stream.of(
      Arguments.of(1, true),
      Arguments.of(4, true),
      Arguments.of(16, true),
      Arguments.of(64, true),
      Arguments.of(0, false),
      Arguments.of(5, false),
      Arguments.of(15, false),
      Arguments.of(1_162_261_466, false)
    );
  }

  @BeforeEach
  void setup() {
    pr = new Pr342PowerOfFour();
  }

  @ParameterizedTest
  @MethodSource("provideNums")
  void testAll(int num, boolean isPower4) {
    assertEquals(isPower4, pr.isPowerOfFour(num));
  }

}
