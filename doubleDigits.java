// doubles a given digit within a number
// recursion
public static int doubleDigit(int n, int d) {
  if (d < 0 || d > 9) {
    throw new IllegalArgumentException();
  }
  if (n < 0) {
    return doubleDigit(-n, d) * -1;
  } else if (n / 10 == 0 && n != d) {
    return n;
  } else if (n / 10 == 0 && n == d) {
    return (n * 10) + n;
  } else { // if n is not a single digit
    if (n % 10 == d) {
      return doubleDigit(n / 10, d) * 100 + doubleDigit(n % 10, d);
    } else {
      return doubleDigit(n / 10, d) * 10 + n % 10;
    }
  }
}
