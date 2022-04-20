package easy;

import java.util.Arrays;

public class Pr40ClimbingStairs {

  public long climbStairs(int n) {

    long[] memo = new long[n + 1];
    Arrays.fill(memo, -1);

    return waysTo(n, memo);

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

  private long waysTo(int step, long[] memo) {

    if (step == 1) {
      return 1;
    }

    if (step == 2) {
      return 2;
    }

    if (memo[step] != -1) {
      return memo[step];
    }

    // ways to reach n-1 plus ways to reach n-2
    long numWays = waysTo(step - 1, memo) + waysTo(step - 2, memo);
    memo[step] = numWays;

    return numWays;

  }

}
