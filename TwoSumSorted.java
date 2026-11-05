// two pointer approach
// use on sorted arrays, palindrome checks, in-place filtering

public int[] twoSumSorted(int[] nums, int target) {
  int left = 0;
  int right = nums.length - 1;

  while (left < right) {
    long sum = (long) nums[left] + nums[right];

    if (sum == target) {
      return new int[] {left, right};
    } else if (sum < target) {
      left++;
    } else {
      right--;
    }
    
  }

  return new int[] {-1, -1};
  // time: O(n)
  
}
