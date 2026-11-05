// (){}[]
// )(}{][
// ({[]})
// (][)

// slowly removing the matching pairs out of the string
// "{[]}" -> "{}" -> ""
// if string empty, then parentheses are valid. if not, e.g. ")", then invalid.

// stack, deque
// scan for opening brackets, slowly add to stack, when we pop off, match with the later brackets
// ( )
// { }
// [ ]

import java.util.*;

class Solution {
  public boolean isValid(String s) {
    Deque<Character> stack = new ArrayDeque<>();

    // check all chars individually
    for (char curr : s.toCharArray()) {
      
      // if the curr = opening bracket, we add it to the stack
      if (curr == "(" || curr == "{" || curr == "[") {
        stack.push(current);
        continue;
      }

      // closing bracket needs an earlier opening bracket
      if (stack.isEmpty()) {
        return false;
      }
      
      // check closing brackets, because every closing needs a corresponding early bracket
      char opening = stack.pop();
      
      // false cases - return true at the end
      if (current == ')' && opening != '(') {
        return false;
      }

      if (current == '}' && opening != '{') {
        return false;
      }

      if (current == ']' && opening != '[') {
        return false;
      }
      
    }
    return stack.isEmpty();
  }
}
