// if two strings are anagrams, they have the same characters & frequencies
// sorting both strings will help us arrange all chars in consistent order
// then if the SORTED strings are the SAME, they are anagrams!

public boolean isAnagram(String s, String t) {
  
  // if they are diff lengths, reject off the bat
  if (s.length() != t.length()) {
    return false;
  }

  // convert to arrays, then sort them
  char[] sSort = s.toCharArray();
  char[] tSort = t.toCharArray();
  Arrays.sort(sSort);
  Arrays.sort(tSort);
  return Arrays.equals(sSort, tSort);

  // time complexity: O(nlogn + mlogm)
  // -> comes from both sorts. java uses pivot quicksort.
}
