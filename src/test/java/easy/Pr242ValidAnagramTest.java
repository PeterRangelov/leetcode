package easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class Pr242ValidAnagramTest {

  private Pr242ValidAnagram pr;

  private static Stream<Arguments> provideAnagrams() {
    return Stream.of(
      Arguments.of("anagram", "nagaram", true),
      Arguments.of("rat", "car", false),
      Arguments.of("anagram", "anagrams", false)
    );
  }

  @BeforeEach
  void setup() {
    pr = new Pr242ValidAnagram();
  }

  @ParameterizedTest
  @MethodSource("provideAnagrams")
  void testAll(String s, String t, boolean isAnagram) {
    assertEquals(pr.isAnagram(s, t), isAnagram);
  }

}
