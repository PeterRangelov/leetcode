package easy;

public class Pr9PalindromeNumber {

  public boolean isPalindrome(int x) {

    if (x < 0) {
      return false;
    }

    int divisor = getInitialDivisor(x);

    while (divisor > 0) {

      // determine first and last digits
      int firstDigit = x / divisor;
      int lastDigit = x % 10;

      if (firstDigit != lastDigit) {
        return false;
      }

      // strip first and last digit
      x -= firstDigit * divisor;
      x /= 10;

      divisor /= 10;

    }

    return true;


  }

  private int getInitialDivisor(int number) {
    int divisor = 1;

    while (divisor * 10 <= number) {
      divisor *= 10;
    }

    return divisor;
  }

}
