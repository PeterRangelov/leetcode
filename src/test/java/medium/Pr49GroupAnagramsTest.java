package medium;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class Pr49GroupAnagramsTest {

  private Pr49GroupAnagrams pr;

  private static Stream<Arguments> provideData() {
    return Stream.of(
      Arguments.of(
        new String[] {
          "tab", "bat", "eat", "tea", "tan", "ate", "nat",
        },
        List.of(
          List.of("eat", "tea", "ate"),
          List.of("tab", "bat"),
          List.of("tan", "nat")
        )
      )
    );

  }

  @BeforeEach
  void setup() {
    pr = new Pr49GroupAnagrams();
  }

  @ParameterizedTest
  @MethodSource("provideData")
  void testAll(String[] strs, List<List<String>> groups) {
    Assertions.assertEquals(groups, pr.groupAnagrams(strs));
  }

}
