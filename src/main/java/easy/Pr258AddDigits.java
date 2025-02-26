package easy;

/**
 * This class provides a solution to LeetCode Problem 258: Add Digits.
 * It contains methods to repeatedly add the digits of a number until a single digit is obtained.
 */
public class Pr258AddDigits {

  /**
   * Reduces the given number to a single digit by adding its digits repeatedly.
   *
   * @param num the number to reduce
   * @return the single-digit result
   */
  public int addDigits(int num) {

    // Approach 1: Pattern-based method using modulo operation
    if (num < 10) {
      return num; // If num is a single digit, return it directly
    }

    // Calculate the remainder when num is divided by 9
    int remainder = num % 9;

    // If the remainder is 0, the result is 9 (unless num is 0)
    return remainder == 0 ? 9 : remainder;

    // Approach 2: Straightforward method (commented out)
    // if (num < 10) {
    //   return num; // If num is a single digit, return it directly
    // }
    //
    // while (num > 9) {
    //   num = sumOfDigitsOneRound(num); // Sum the digits in one round
    // }
    //
    // return num; // Return the single-digit result
  }

  /**
   * Sums the digits of the number in one round.
   *
   * @param num the number whose digits are to be summed
   * @return the sum of the digits
   */
  public int sumOfDigitsOneRound(int num) {

    if (num < 10) {
      return num; // If num is a single digit, return it directly
    }

    int sum = 0; // Initialize sum of digits

    int divisor = getDivisor(num); // Get the highest divisor for the number

    // While there are digits left to process
    while (divisor >= 1) {
      // Calculate the first digit
      int firstDigit = num / divisor;

      // Increment the sum by the first digit
      sum += firstDigit;

      // Strip the number of the first digit processed
      num -= divisor * firstDigit;

      // Update divisor to process the next digit
      divisor /= 10;
    }

    return sum; // Return the sum of the digits
  }

  /**
   * Gets the highest power of ten divisor for the given number.
   *
   * @param num the number to analyze
   * @return the highest divisor that is a power of ten
   */
  public int getDivisor(int num) {
    int divisor = 1; // Start with the lowest divisor (1)

    // Calculate the highest divisor that is a power of ten and less than or equal to num
    while (divisor <= Integer.MAX_VALUE / 10 && divisor * 10 <= num) {
      divisor *= 10;
    }

    return divisor; // Return the calculated divisor
  }

}