package easy;


import java.util.Stack;

import easy.models.TreeNode;

public class Pr112PathSum {

  public boolean hasPathSum(TreeNode root, int targetSum) {

    if (root == null) {
      return false;
    }

    // a leaf where sum has been reached
    if (root.left == null && root.right == null && targetSum == root.val) {
      return true;
    }

    return hasPathSum(root.left, targetSum - root.val) ||
      hasPathSum(root.right, targetSum - root.val);

  }

  public boolean hasPathSumStack(TreeNode root, int targetSum) {

    if (root == null) {
      return false;
    }

    Stack<Integer> sumStack = new Stack<>();
    Stack<TreeNode> nodeStack = new Stack<>();

    nodeStack.add(root);
    sumStack.add(targetSum - root.val);

    while (!nodeStack.isEmpty()) {
      TreeNode currentNode = nodeStack.pop();
      int currentSum = sumStack.pop();

      if (currentNode.left == null && currentNode.right == null && currentSum == 0) {
        return true;
      }

      if (currentNode.left != null) {
        nodeStack.add(currentNode.left);
        sumStack.add(currentSum - currentNode.left.val);
      }

      if (currentNode.right != null) {
        nodeStack.add(currentNode.right);
        sumStack.add(currentSum - currentNode.right.val);
      }
      
    }
    return false;

  }

}
