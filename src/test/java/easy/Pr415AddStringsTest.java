package easy;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class Pr415AddStringsTest {

  private Pr415AddStrings pr;

  private static Stream<Arguments> provideData() {
    return Stream.of(
      Arguments.of("905", "6", "911"),
      Arguments.of("5555", "4", "5559"),
      Arguments.of("5", "4", "9"),
      Arguments.of("1", "2", "3"),
      Arguments.of("11", "12", "23"),
      Arguments.of("0", "0", "0")
    );
  }

  @BeforeEach
  void setup() {
    pr = new Pr415AddStrings();
  }

  @ParameterizedTest
  @MethodSource("provideData")
  void testAll(String num1, String num2, String sum) {
    Assertions.assertEquals(sum, pr.addStrings(num1, num2));
  }

}
