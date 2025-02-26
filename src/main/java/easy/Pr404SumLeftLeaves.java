package easy;

import easy.models.TreeNode;

/**
 * This class provides a solution to LeetCode Problem 404: Sum of Left Leaves.
 * It calculates the sum of all left leaves in a given binary tree.
 */
public class Pr404SumLeftLeaves {

  /**
   * Computes the sum of all left leaves in the binary tree.
   *
   * @param root the root node of the binary tree
   * @return the sum of all left leaves
   */
  public int sumOfLeftLeaves(TreeNode root) {

    // Base case: if the tree is empty, return 0
    if (root == null) {
      return 0;
    }

    // Check if the left child is a leaf
    if (root.left != null && root.left.left == null && root.left.right == null) {
      // If it's a leaf, add its value and continue with the right subtree
      return root.left.val + sumOfLeftLeaves(root.right);
    }

    // Recursively calculate the sum for both left and right subtrees
    return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
  }
}