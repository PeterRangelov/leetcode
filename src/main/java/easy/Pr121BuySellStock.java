package easy;

public class Pr121BuySellStock {

  public int maxProfit(int[] prices) {

    if (prices.length <= 1) {
      return 0;
    }

    int buyIdx = 0, sellIdx = 1, profit = 0;

    while (sellIdx < prices.length) {

      // is it a profitable transaction?
      if (prices[sellIdx] > prices[buyIdx]) {
        profit = Math.max(profit, prices[sellIdx] - prices[buyIdx]);
      }

      // not profitable
      else {
        buyIdx = sellIdx;
      }

      // in any case, increment sell index
      sellIdx++;
    }

    return profit;

  }

}
