package easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class Pr9PalindromeNumberTest {

  private Pr9PalindromeNumber pr;

  private static Stream<Arguments> provideNumbers() {
    return Stream.of(
      Arguments.of(121, true),
      Arguments.of(313, true),
      Arguments.of(10_000_021, false)
    );
  }

  @BeforeEach
  void setup() {
    pr = new Pr9PalindromeNumber();
  }

  @ParameterizedTest
  @MethodSource("provideNumbers")
  void testAll(int number, boolean isPalindrome) {
    assertEquals(isPalindrome, pr.isPalindrome(number));
  }

}
