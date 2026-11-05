// concept: arrays and hash maps
// hash map trades extra memory space for 
//   O(1) average-time lookups, insertions, and updates.

public int[] twoSum(int[] nums, int target) {
  // use hash map for pair matching
  
  Map<Integer, Integer> seen = new HashMap<>();

  // loop through items
  
  for (int i = 0; i < nums.length; i++) {
    
    // you figure out how much is left to find
    // given the one you already have, to get to target
    int complement = target - nums[i];

    if (seen.containsKey(complement)) {
      return new int[] {seen.get(complement), i};
    }
    seen.put(nums[i], i);
  }

  return new int[] {-1, -1};
}
