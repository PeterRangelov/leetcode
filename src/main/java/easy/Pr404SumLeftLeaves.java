package easy;

import easy.models.TreeNode;

public class Pr404SumLeftLeaves {

  public int sumOfLeftLeaves(TreeNode root) {

    int sum = 0;

    return total(root, sum, false);
  }

  int total(TreeNode node, int sum, boolean isLeft) {

    if (node == null || node.left == null) {
      return sum;
    }

    // are we at a left leaf?
    // impossible to tell but we know if node.left is a left leaf
    if (node.left.left == null && node.left.right == null) {
      sum += node.left.val;
    }

    total(node.left, sum, true);
    total(node.right, sum, false);

    return sum;
  }

}
