// recursive backtracking
// cat can jump between 1 and maxJumpHeight at a time
// print out all possible jump combinations to get levels
public static int climbingCats(int levels, int maxJumpHeight) {
  return climbingCats(levels, maxJumpHeight, new Stack<Integer>());
}

private static int climbingCats(int levels, int maxJumpHeight, Stack<Integer> soFar) {
  if (levels == 0) {
    System.out.println(soFar);
    return 1;
  }
  int total = 0;
  for (int i = 1; i <= maxJumpHeight; i++) {
    if (levels - i >= 0) {
      soFar.push(i);
      total += climbingCats(levels - i, maxJumpHeight, soFar);
      soFar.pop();
    }
  }
  return total;
}
