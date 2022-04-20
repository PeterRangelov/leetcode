package easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class Pr859BuddyStringsTest {

  private Pr859BuddyStrings pr;

  private static Stream<Arguments> provideData() {
    return Stream.of(
      Arguments.of(null, null, false),
      Arguments.of("x", "x", false),
      Arguments.of("abc", "cabd", false),
      Arguments.of("ab", "ba", true),
      Arguments.of("ab", "ab", false),
      Arguments.of("aa", "aa", true),
      Arguments.of("ab", "ca", false),
      Arguments.of("aaaaaaabc", "aaaaaaacb", true)
    );
  }

  @BeforeEach
  void setup() {
    pr = new Pr859BuddyStrings();
  }

  @ParameterizedTest
  @MethodSource("provideData")
  void testAll(String s, String goal, boolean isBuddy) {
    assertEquals(isBuddy, pr.buddyStrings(s, goal));
  }

}
