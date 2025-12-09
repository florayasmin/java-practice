// binary int tree
// descendant if it's its own or previously connected node
public boolean isDescendant(int descendant, int ancestor) {
  return isDescendant(this.overallRoot, descendant, ancestor);
}

private boolean isDescendant(IntTreeNode root, int descendant, int ancestor) {
  if (root == null) {
    return false;
  }
  if (root.data == ancestor) {
    return contains(root, descendant);
  }
  return isDescendant(root.left, descendant, ancestor) || isDescendant(root.left, descendant, ancestor);
}

private boolean contains(IntTreeNode root, int target) {
  if (root == null) {
    return false;
  }
  return root.data == target || contains(root.left, target) || contains(root.right, target);
}
