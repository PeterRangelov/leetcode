package easy;

public class Pr342PowerOfFour {

  public boolean isPowerOfFour(int n) {

    // approach 1: convert to binary. only one bit should be true. pos: 1, 3, 5

    //    return Integer.bitCount(n) == 1 && Integer.highestOneBit(n) % 2 == 1;

    // approach 2: brute force, keep multiplying

    //    int gauge = 1;
    //
    //    while (gauge <= Integer.MAX_VALUE / 4 && gauge < n) {
    //      gauge *= 4;
    //    }
    //
    //    return gauge == n;

    // approach 3: brute force, this time divide
    if (n == 0) {
      return false;
    }

    while (n != 1) {
      if (n % 4 != 0) {
        return false;
      }
      n /= 4;
    }

    return true;

    // approach 4: use log

    //    return (Math.log(n) / Math.log(4)) % 1 == 0;


  }

}
