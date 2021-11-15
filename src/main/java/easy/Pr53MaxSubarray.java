package easy;

public class Pr53MaxSubarray {

  public int maxSubArray(int[] nums) {

    int maxSum = nums[0];
    int currSum = maxSum;

    for (int i = 1; i < nums.length; i++) {
      currSum = Math.max(currSum + nums[i], nums[i]);
      if (currSum > maxSum) {
        maxSum = currSum;
      }
    }

    return maxSum;
  }
}
