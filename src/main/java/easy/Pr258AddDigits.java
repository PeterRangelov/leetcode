package easy;

public class Pr258AddDigits {

  public int addDigits(int num) {

    // approach 1: pattern-based. fpr every 10 in number we jump 9 in result

    if (num < 10) {
      return num;
    }

    int remainder = num % 9;

    return remainder == 0 ? 9 : remainder;

    // approach 2: straight forward way
    //    if (num < 10) {
    //      return num;
    //    }
    //
    //    while (num > 9) {
    //      num = sumOfDigitsOneRound(num);
    //    }
    //
    //    return num;

  }

  public int sumOfDigitsOneRound(int num) {

    if (num < 10) {
      return num;
    }

    int sum = 0;

    int divisor = getDivisor(num);

    while (divisor >= 1) {

      // calculate first digit
      int firstDigit = num / divisor;

      // increment sum
      sum += firstDigit;

      // strip number of first digit
      num -= divisor * firstDigit;

      // update divisor
      divisor /= 10;
    }

    return sum;
  }

  public int getDivisor(int num) {
    int divisor = 1;

    while (divisor <= Integer.MAX_VALUE / 10 && divisor * 10 <= num) {
      divisor *= 10;
    }

    return divisor;
  }

}
