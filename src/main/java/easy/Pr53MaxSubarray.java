package easy;

public class Pr53MaxSubarray {

  public int maxSubArray(int[] nums) {

    int max = nums[0];
    int cur = 0;

    for (int n : nums) {

      if (cur < 0) {
        cur = 0;
      }

      cur += n;
      max = Math.max(cur, max);
    }

    return max;
  }
}
