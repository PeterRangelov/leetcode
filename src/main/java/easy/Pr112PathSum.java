package easy;

import java.util.Stack;
import easy.models.TreeNode;

/**
 * This class provides a solution to LeetCode Problem 112: Path Sum.
 * It contains methods to determine if a binary tree has a root-to-leaf
 * path such that adding up all the values along the path equals the
 * given target sum. Two approaches are implemented: a recursive
 * method and an iterative method using a stack.
 */
public class Pr112PathSum {

  // Recursive method to check if a path sum exists
  public boolean hasPathSum(TreeNode root, int targetSum) {

    // Base case: if the root is null, there is no path
    if (root == null) {
      return false;
    }

    // Check if we are at a leaf node and the remaining sum equals the node's value
    if (root.left == null && root.right == null && targetSum == root.val) {
      return true;
    }

    // Recursively check the left and right subtrees with the updated target sum
    return hasPathSum(root.left, targetSum - root.val) ||
            hasPathSum(root.right, targetSum - root.val);
  }

  // Iterative method to check if a path sum exists using stacks
  public boolean hasPathSumStack(TreeNode root, int targetSum) {

    // Base case: if the root is null, there is no path
    if (root == null) {
      return false;
    }

    // Stacks to hold nodes and corresponding remaining sums
    Stack<Integer> sumStack = new Stack<>();
    Stack<TreeNode> nodeStack = new Stack<>();

    // Initialize the stacks with the root node and the initial target sum
    nodeStack.add(root);
    sumStack.add(targetSum - root.val);

    // Iterate while there are nodes to process
    while (!nodeStack.isEmpty()) {
      TreeNode currentNode = nodeStack.pop();
      int currentSum = sumStack.pop();

      // Check if we reached a leaf node with a sum that matches the target
      if (currentNode.left == null && currentNode.right == null && currentSum == 0) {
        return true;
      }

      // If there is a left child, add it to the stack with the updated sum
      if (currentNode.left != null) {
        nodeStack.add(currentNode.left);
        sumStack.add(currentSum - currentNode.left.val);
      }

      // If there is a right child, add it to the stack with the updated sum
      if (currentNode.right != null) {
        nodeStack.add(currentNode.right);
        sumStack.add(currentSum - currentNode.right.val);
      }
    }

    // If no path with the given sum was found, return false
    return false;
  }
}