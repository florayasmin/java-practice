public class LinkedIntList {
  private ListNode front;
  // <methods>

  // expand: treats list as count-value pairs and modifies the list 
  // to expand every 'value' by 'count'
  public void expand() {
    if (front != null) {
      // Front Case
      ListNode curr = front.next;
      for (int i = 0; i < front.data - 1; i++) {
        curr.next = new ListNode(curr.data, curr.next);
        curr = curr.next;
      }
      front = front.next;
      
      // Middle Case
      while (curr.next != null && curr.next.next != null) {
        int multiple = curr.next.data;
        curr.next = curr.next.next;
        curr = curr.next;
        for (int i = 0; i < multiple - 1; i++) {
          curr.next = new ListNode(curr.data, curr.next);
          curr = curr.next;
        }
      }
    }
  }

  private static class ListNode {
    public int data;
    public ListNode next;
    // <constructors>
  }
}
