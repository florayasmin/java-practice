// longest substring without repeating characters
// sliding window approach
// -> use for contiguous substrings or subarrays, efficiently update the window

public int lengthOfLongestSubstring(String s) {
  Set<Character> window = new HashSet<>();
  int left = 0;
  int best = 0; // this will be returned

  // each character enters and leaves the window at most once
  for (int right = 0; right < s.length(); right++) {
    char c = s.charAt(right);

    while (window.contains(c)) {
      window.remove(s.charAt(left));
      left++;
    }

    window.add(c);
    best = Math.max(best, right - left + 1);
  }

  return best;
}
