package easy;

import java.util.Arrays;

/**
 * This class provides a solution to LeetCode Problem 40: Climbing Stairs.
 * It calculates the number of distinct ways to reach the top of a staircase
 * with `n` steps, where you can take either 1 or 2 steps at a time.
 * The solution utilizes memoization to optimize the recursive approach.
 */
public class Pr40ClimbingStairs {

  // Method to calculate the number of ways to climb `n` stairs
  public long climbStairs(int n) {

    // Create a memoization array to store the results of subproblems
    long[] memo = new long[n + 1];
    Arrays.fill(memo, -1); // Initialize the memoization array with -1

    // Start the recursive calculation with memoization
    return waysTo(n, memo);
  }

  // Recursive method to calculate the number of ways to reach a specific step (without memoization)
  private long waysTo(int step) {

    // Base cases
    if (step == 1) {
      return 1; // Only one way to climb 1 step
    }

    if (step == 2) {
      return 2; // Two ways to climb 2 steps (1+1 or 2)
    }

    // Recursive calls: ways to reach (step-1) plus ways to reach (step-2)
    return waysTo(step - 1) + waysTo(step - 2);
  }

  // Recursive method to calculate the number of ways to reach a specific step (with memoization)
  private long waysTo(int step, long[] memo) {

    // Base cases
    if (step == 1) {
      return 1; // Only one way to climb 1 step
    }

    if (step == 2) {
      return 2; // Two ways to climb 2 steps (1+1 or 2)
    }

    // Return the cached result if it exists
    if (memo[step] != -1) {
      return memo[step];
    }

    // Calculate the number of ways to reach the current step and store it in the memoization array
    long numWays = waysTo(step - 1, memo) + waysTo(step - 2, memo);
    memo[step] = numWays; // Store the result for future reference

    return numWays;
  }
}