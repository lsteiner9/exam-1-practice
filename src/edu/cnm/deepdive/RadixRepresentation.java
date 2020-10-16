package edu.cnm.deepdive;

public class RadixRepresentation {

  static String toRadix(long value, int radix) {
    StringBuilder builder = new StringBuilder();
    long n = Math.abs(value);
    while (n != 0) {
      int remainder = (int) (n % radix);
      if (remainder > 10) {
        char c = (char) (remainder + 87);
        builder.insert(0, c);
      } else {
        builder.insert(0, remainder);
      }
      long digit = value / radix;
      n /= radix;
    }
    if (builder.length() == 0) {
      builder.append('0');
    } else if (value < 0) {
      builder.insert(0, "-");
    }
    return builder.toString();
  }

}
