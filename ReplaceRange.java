// iterative programming with linked lists! implemented within LinkedIntList class
// replaces elements from 'start' to 'end' (inclusive) with newValue
public void replaceIndexRange(int start, int end, int newValue) {
  if (start < 0 || end > list.size() - 1 || end < start) {
    throw new IllegalArgumentException();
  }
  while (front != null) {
    if (start == 0) {
      this.front = new ListNode(newValue, front.next);
      ListNode curr = front;
      while (start != end) {
        curr.next = new ListNode(newValue, curr.next.next);
        curr = curr.next;
        start++;
      }
    } else {
      ListNode curr = front.next;
      int index = 1;
      while (index < start - 1 && curr.next != null) {
        curr = curr.next;
        index++;
      }
      if (index == start - 1 && curr.next != null) {
        for (int i = index; i < end; i++) {
          curr.next = new ListNode(newValue, curr.next.next);
          curr = curr.next;
        }
      }
    }
  }
}
