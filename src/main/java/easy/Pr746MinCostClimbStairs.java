package easy;

/**
 * This class provides a solution to the problem of finding the minimum cost
 * to climb a staircase, where each step has a specific associated cost.
 * The climber can start from either the first or the second step and can
 * climb either one or two steps at a time.
 */
public class Pr746MinCostClimbStairs {

  /**
   * Calculates the minimum cost to reach the top of the staircase.
   *
   * @param cost an array where cost[i] represents the cost of the i-th step.
   *             The length of the array represents the total number of steps.
   * @return the minimum cost to reach the top of the staircase.
   */
  public int minCostClimbingStairs(int[] cost) {
    // Initialize an array to store the minimum cost to reach each step
    int n = cost.length;
    int[] minCost = new int[n + 1];

    // Base cases: cost to reach the first step is 0 (starting point)
    // Cost to reach the second step is the cost of the first step
    minCost[0] = 0;
    minCost[1] = cost[0];

    // Fill the minCost array
    for (int i = 2; i <= n; i++) {
      // The cost to reach step i is the minimum of the cost to reach
      // the previous step or the step before that, plus the current step cost
      minCost[i] = Math.min(minCost[i - 1] + (i == n ? 0 : cost[i - 1]),
              minCost[i - 2] + (i == n ? 0 : cost[i - 2]));
    }

    // The minimum cost to reach the top is in minCost[n]
    return minCost[n];
  }
}