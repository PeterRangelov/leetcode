package easy;

/**
 * This class provides a solution to LeetCode Problem 9: Palindrome Number.
 * It contains a method to determine whether a given integer is a palindrome.
 * A palindrome is a number that reads the same backward as forward.
 * Negative numbers are not considered palindromes.
 */
public class Pr9PalindromeNumber {

  // Method to check if a number is a palindrome
  public boolean isPalindrome(int x) {

    // A negative number cannot be a palindrome
    if (x < 0) {
      return false;
    }

    // Get the initial divisor, which is the largest power of 10 less than or equal to x
    int divisor = getInitialDivisor(x);

    // Loop until there are no more digits to compare
    while (divisor > 0) {

      // Determine the first and last digits of the current number
      int firstDigit = x / divisor; // First digit is obtained by dividing by the divisor
      int lastDigit = x % 10; // Last digit is obtained by taking the modulus with 10

      // If the first and last digits do not match, x is not a palindrome
      if (firstDigit != lastDigit) {
        return false;
      }

      // Strip the first and last digit from the number
      x -= firstDigit * divisor; // Remove the first digit
      x /= 10; // Remove the last digit

      // Reduce the divisor by a factor of 10 for the next iteration
      divisor /= 10;
    }

    // If all digits matched, x is a palindrome
    return true;
  }

  // Helper method to find the initial divisor for the number
  private int getInitialDivisor(int number) {
    int divisor = 1;

    // Multiply divisor by 10 until it exceeds the number
    while (divisor * 10 <= number) {
      divisor *= 10;
    }

    // Return the largest divisor found
    return divisor;
  }
}