package easy;

/**
 * This class provides a solution to LeetCode Problem 342: Power of Four.
 * It checks if a given integer n is a power of four.
 */
public class Pr342PowerOfFour {

  /**
   * Checks if the integer n is a power of four.
   *
   * @param n the integer to check
   * @return true if n is a power of four, false otherwise
   */
  public boolean isPowerOfFour(int n) {

    // Approach 1: Check using bit manipulation
    // Only one bit should be true, and the highest bit's position should be odd (1, 3, 5, ...)
    // return Integer.bitCount(n) == 1 && Integer.highestOneBit(n) % 2 == 1;

    // Approach 2: Brute force method, keep multiplying by 4
    // int gauge = 1;
    // while (gauge <= Integer.MAX_VALUE / 4 && gauge < n) {
    //   gauge *= 4;
    // }
    // return gauge == n;

    // Approach 3: Brute force, divide n by 4 until it equals 1
    if (n == 0) {
      return false; // 0 is not a power of four
    }

    while (n != 1) {
      if (n % 4 != 0) {
        return false; // n is not divisible by 4, hence not a power of four
      }
      n /= 4; // Divide n by 4 for the next iteration
    }

    return true; // If we reach here, n is a power of four

    // Approach 4: Use logarithm
    // return (Math.log(n) / Math.log(4)) % 1 == 0; // This checks if log base 4 of n is an integer
  }

}