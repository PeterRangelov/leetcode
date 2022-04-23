package medium;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class Pr200NumIslandsTest {

  private Pr200NumIslands pr;

  private static Stream<Arguments> provideData() {
    return Stream.of(
      Arguments.of(
        new char[][] {
          {'0'}
        }, 0),
      Arguments.of(
        new char[][] {
          {'1'}
        }, 1),
      Arguments.of(
        new char[][] {
          {'1', '1', '1', '1', '0'},
          {'1', '1', '0', '1', '0'},
          {'1', '1', '0', '0', '0'},
          {'0', '0', '0', '0', '0'}
        }, 1),
      Arguments.of(
        new char[][] {
          {'1', '1', '0', '0', '0'},
          {'1', '1', '0', '0', '0'},
          {'0', '0', '1', '0', '0'},
          {'0', '0', '0', '1', '1'}
        }, 3)
    );

  }

  @BeforeEach
  void setup() {
    pr = new Pr200NumIslands();
  }

  @ParameterizedTest
  @MethodSource("provideData")
  void testAll(char[][] grid, int count) {
    Assertions.assertEquals(count, pr.numIslands(grid));
  }

}
