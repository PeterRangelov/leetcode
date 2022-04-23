package easy;

public class Pr53MaxSubarray {

  public int maxSubArray(int[] nums) {

    // Approach 1
    
    //    int max = nums[0];
    //    int cur = 0;
    //
    //    for (int n : nums) {
    //
    //      if (cur < 0) {
    //        cur = 0;
    //      }
    //
    //      cur += n;
    //      max = Math.max(cur, max);
    //    }
    //
    //    return max;

    // Approach 2

    int maxCurrent = nums[0], maxGlobal = nums[0];

    for (int i = 1; i < nums.length; i++) {
      maxCurrent = Math.max(maxCurrent + nums[i], nums[i]);
      maxGlobal = Math.max(maxCurrent, maxGlobal);
    }

    return maxGlobal;
  }
}
