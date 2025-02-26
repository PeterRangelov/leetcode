package easy;

/**
 * This class provides a solution to LeetCode Problem 53: Maximum Subarray.
 * It contains a method to find the contiguous subarray within a one-dimensional
 * array of numbers that has the largest sum. The method implements an efficient
 * algorithm to solve the problem using dynamic programming principles.
 */
public class Pr53MaxSubarray {

  // Method to find the maximum sum of a contiguous subarray
  public int maxSubArray(int[] nums) {

    // Approach 1 (commented out)
    // This approach uses a simple iterative method to track the current
    // sum of the subarray and updates the maximum sum found so far.
    //
    // int max = nums[0];
    // int cur = 0;
    //
    // for (int n : nums) {
    //   if (cur < 0) {
    //     cur = 0; // Reset current sum if it becomes negative
    //   }
    //   cur += n; // Add the current number to the current sum
    //   max = Math.max(cur, max); // Update max if current sum is greater
    // }
    // return max; // Return the maximum sum found

    // Approach 2
    // This approach implements Kadane's Algorithm to find the maximum subarray sum
    // in a more optimized manner by maintaining two variables: one for the current
    // maximum sum and one for the global maximum sum found.

    int maxCurrent = nums[0], maxGlobal = nums[0];

    // Iterate through the array starting from the second element
    for (int i = 1; i < nums.length; i++) {
      // Update current maximum sum to be either the current element
      // or the sum of the current element and the previous maximum
      maxCurrent = Math.max(maxCurrent + nums[i], nums[i]);

      // Update global maximum sum if current maximum is greater
      maxGlobal = Math.max(maxCurrent, maxGlobal);
    }

    // Return the maximum global sum found
    return maxGlobal;
  }
}