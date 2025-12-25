// binary tree modification with recursion, implemented within IntTree class
// increments every left child's value
public void incrementLefties() {
  this.overallRoot = incrementLefties(this.overallRoot); // x = change(x)
}

private IntTreeNode incrementLefties(IntTreeNode root) {
  root.left = incrementLefties(root.left);
  root.right = incrementLefties(root.right);
  if (root != null && hasLeft(root)) {
    int newData = root.left.data + 1;
    root.left = new IntTreeNode(newData, root.left.left, root.right.right);
  }
  return root;
}

private static boolean hasLeft(IntTreeNode curr) {
  if (curr.left != null) {
    return true;
  } else {
    return false;
  }
}
