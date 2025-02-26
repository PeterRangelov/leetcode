package easy;

/**
 * This class provides a solution to LeetCode Problem 231: Power of Two.
 * It contains a method to determine if a given integer is a power of two.
 */
public class Pr231PowerOfTwo {

  /**
   * Checks if the given integer n is a power of two.
   *
   * @param n the integer to check
   * @return true if n is a power of two, false otherwise
   */
  public boolean isPowerOfTwo(int n) {

    // Approach 1: Brute force multiply up (commented out)
    // long gauge = 1;
    // while (gauge * 2 <= n) {
    //   gauge *= 2;
    // }
    // return gauge == n;

    // Approach 2: Brute force divide down
    if (n == 0) {
      return false; // Zero is not a power of two
    }

    // Continuously divide n by 2 until it equals 1
    while (n != 1) {
      // If n is odd, it's not a power of two
      if (n % 2 != 0) {
        return false;
      }
      n /= 2; // Divide n by 2
    }

    // If we reach here, n is a power of two
    return true;

    // Approach 3: Use logarithm (commented out)
    // return (Math.log(n) / Math.log(2)) % 1 == 0;

    // Approach 4: Check binary representation (commented out)
    // return n > 0 && Integer.bitCount(n) == 1;

    // Approach 5: Bit manipulation (commented out)
    // return ((n & (n - 1)) == 0 && n > 0);
  }
}