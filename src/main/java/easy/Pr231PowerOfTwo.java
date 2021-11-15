package easy;

public class Pr231PowerOfTwo {

  public boolean isPowerOfTwo(int n) {

    // approach 1: brute force multiply up
    //    long gauge = 1;
    //
    //    while (gauge * 2 <= n) {
    //      gauge *= 2;
    //    }
    //
    //    return gauge == n;

    // approach 2: brute force divide down
    if (n == 0) {
      return false;
    }

    while (n != 1) {
      if (n % 2 != 0) {
        return false;
      }
      n /= 2;
    }

    return true;

    // approach 3: use log (does not work for large numbers for some reason)
    //    return (Math.log(n) / Math.log(2)) % 1 == 0;

    // approach 4: if it's power of two then binary should only have one "1"

    //    return n > 0 && Integer.bitCount(n) == 1;

    // approach 5: bit manipulation magic (why does this work?!)
    //    return ((n & (n - 1)) == 0 && n > 0);

  }
}
