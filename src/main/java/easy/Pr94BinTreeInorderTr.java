package easy;

import java.util.ArrayList;
import java.util.List;
import easy.models.TreeNode;

/**
 * This class provides a solution to LeetCode Problem 94: Binary Tree Inorder Traversal.
 * It contains methods to perform an inorder traversal of a binary tree and
 * return the values of the nodes in a list. Inorder traversal visits the nodes
 * in the order of left subtree, root, and then right subtree.
 */
public class Pr94BinTreeInorderTr {

  // Method to perform inorder traversal of a binary tree
  public List<Integer> inorderTraversal(TreeNode root) {

    // Create a list to store the values of the nodes during traversal
    List<Integer> nodeValues = new ArrayList<>();

    // Start the recursive traversal
    return traverse(root, nodeValues);
  }

  // Recursive helper method to traverse the tree in inorder
  private List<Integer> traverse(TreeNode node, List<Integer> values) {

    // Base case: if the current node is null, return the accumulated values
    if (node == null) {
      return values;
    }

    // Recursively traverse the left subtree
    traverse(node.left, values);

    // Add the value of the current node to the list
    values.add(node.val);

    // Recursively traverse the right subtree
    traverse(node.right, values);

    // Return the accumulated values after traversal
    return values;
  }
}