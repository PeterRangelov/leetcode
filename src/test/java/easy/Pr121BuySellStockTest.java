package easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class Pr121BuySellStockTest {

  Pr121BuySellStock pr;

  private static Stream<Arguments> provideNums() {
    return Stream.of(
      Arguments.of(new int[] {7, 1, 5, 3, 6, 4}, 5),
      Arguments.of(new int[] {7, 6, 4, 3, 1}, 0)
    );
  }

  @BeforeEach
  void setup() {
    pr = new Pr121BuySellStock();
  }

  @ParameterizedTest
  @MethodSource("provideNums")
  void testAll(int[] prices, int profit) {
    assertEquals(profit, pr.maxProfit(prices));
  }
}
