package medium;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class Pr201LargestIslandTest {

  private Pr201LargestIsland pr;

  private static Stream<Arguments> provideData() {
    return Stream.of(
      Arguments.of(
        new int[][] {
          {1}
        }, 1),
      Arguments.of(
        new int[][] {
          {0, 0, 0, 0, 0},
          {0, 0, 0, 0, 0},
          {0, 0, 0, 0, 0},
          {0, 0, 0, 0, 0}
        }, 0),
      Arguments.of(
        new int[][] {
          {0, 1, 0, 0, 0},
          {0, 0, 1, 0, 0},
          {0, 0, 0, 1, 0},
          {1, 0, 0, 0, 0}
        }, 1),
      Arguments.of(
        new int[][] {
          {1, 1, 0, 1, 0},
          {1, 1, 0, 1, 0},
          {1, 1, 0, 0, 0},
          {0, 0, 0, 0, 0}
        }, 6),
      Arguments.of(
        new int[][] {
          {1, 1, 0, 0, 0},
          {1, 1, 0, 0, 0},
          {0, 0, 1, 0, 0},
          {0, 0, 0, 1, 1}
        }, 4),
      Arguments.of(
        new int[][] {
          {0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
          {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
          {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
          {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
          {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
          {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
          {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
          {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0},
        }, 6)

    );

  }

  @BeforeEach
  void setup() {
    pr = new Pr201LargestIsland();
  }

  @ParameterizedTest
  @MethodSource("provideData")
  void testAll(int[][] grid, int maxArea) {
    Assertions.assertEquals(maxArea, pr.maxAreaOfIsland(grid));
  }

}
