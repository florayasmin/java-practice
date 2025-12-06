// checks if two equal length string have dashes in the same places
// recursion
public boolean sameDashes(String str1, String str2) {
  if (str1 == null || str2 == null || str1.length() != str2.length()) {
    throw new IllegalArgumentException();
  }
  if (str1.length() == 0) {
    return true;
  }
  if (str1.charAt(0) == '-' && str.charAt(0) != '-') {
    return false;
  }
  if (str1.charAt(0) != '-' && str.charAt(0) == '-') {
    return false;
  }
  return sameDashes(str1.substring(1), str2.substring(1));
}
