package easy;

import java.util.HashMap;
import java.util.Map;

public class Pr746MinCostClimbStairs {

  public int minCostClimbingStairs(int[] cost) {

    Map<int[], Integer> memo = new HashMap<>();

    int totalCost = 0;

    // left to right isn't gonna work
    int currentStep = Math.min(cost[0], cost[1]);

    for (int i = 0; i < cost.length - 1; i++) {

      if (cost[i] < cost[i + 1]) {
        totalCost += cost[i];
      }
      else {
        totalCost += cost[i + 1];
      }

    }

    return totalCost;
  }

  private long waysTo(int step) {

    if (step == 1) {
      return 1;
    }

    if (step == 2) {
      return 2;
    }

    // ways to reach n-1 plus ways to reach n-2

    return waysTo(step - 1) + waysTo(step - 2);

  }

  //  private int computeCost(int step, int[] cost, Map<int[], Integer> memo) {
  //
  //    if (step == 1) {
  //      return 1;
  //    }
  //
  //    if (step == 2) {
  //      return 2;
  //    }
  //
  //    if (memo.containsKey(cost)) {
  //      return memo.get(cost);
  //    }
  //
  //    // ways to reach n-1 plus ways to reach n-2
  //    long numWays = waysTo(step - 1, memo) + waysTo(step - 2, memo);
  //    memo[step] = numWays;
  //
  //    return numWays;
  //
  //  }

}
