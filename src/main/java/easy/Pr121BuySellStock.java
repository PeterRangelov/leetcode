package easy;

/**
 * This class provides a solution to LeetCode Problem 121: Best Time to Buy and Sell Stock.
 * It contains a method to calculate the maximum profit from buying and selling stock
 * given an array of stock prices, where the ith element represents the price on day i.
 */
public class Pr121BuySellStock {

  /**
   * Calculates the maximum profit from buying and selling stock.
   *
   * @param prices an array of integers representing stock prices on different days
   * @return the maximum profit achievable; returns 0 if no profit can be made
   */
  public int maxProfit(int[] prices) {

    // If there is only one price or none, no profit can be made
    if (prices.length <= 1) {
      return 0;
    }

    // Initialize indices for the buying and selling days, and the profit variable
    int buyIdx = 0, sellIdx = 1, profit = 0;

    // Iterate through the prices array with the selling index
    while (sellIdx < prices.length) {

      // Check if the current transaction is profitable
      if (prices[sellIdx] > prices[buyIdx]) {
        // Update profit if the current transaction yields a higher profit
        profit = Math.max(profit, prices[sellIdx] - prices[buyIdx]);
      }

      // If not profitable, update the buying index to the current selling index
      else {
        buyIdx = sellIdx;
      }

      // Increment the selling index in any case
      sellIdx++;
    }

    // Return the maximum profit found
    return profit;
  }
}