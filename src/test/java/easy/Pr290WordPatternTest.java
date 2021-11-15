package easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class Pr290WordPatternTest {

  Pr290WordPattern pr;

  private static Stream<Arguments> provideData() {
    return Stream.of(
      Arguments.of("abba", "dog cat cat dog", true),
      Arguments.of("abba", "dog cat cat fish", false),
      Arguments.of("aaaa", "dog cat cat dog", false),
      Arguments.of("abba", "dog dog dog dog", false),
      Arguments.of("abba", "dog cat cat dog fish", false)
    );
  }

  @BeforeEach
  void setup() {
    pr = new Pr290WordPattern();
  }

  @ParameterizedTest
  @MethodSource("provideData")
  void testAll(String pattern, String s, boolean isPattern) {
    assertEquals(isPattern, pr.wordPattern(pattern, s));
  }

}
