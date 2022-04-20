package easy;

import easy.models.TreeNode;

public class Pr404SumLeftLeaves {



  public int sumOfLeftLeaves(TreeNode root) {

    // BFS, use queues

    if (root == null) {
      return 0;
    }

    if (root.left != null && root.left.left == null && root.left.right == null) {
      return root.left.val + sumOfLeftLeaves(root.right);
    }

    return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);

  }



}
