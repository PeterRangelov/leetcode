package easy;

import java.util.ArrayList;
import java.util.List;

import easy.models.TreeNode;

/**
 * This class provides a solution to LeetCode Problem 144: Binary Tree Preorder Traversal.
 * It contains methods to perform a preorder traversal of a binary tree,
 * collecting the values of the nodes in the order they are visited.
 */
public class Pr144BinTreePreorderTr {

  /**
   * Performs a preorder traversal of the binary tree.
   *
   * @param root the root node of the binary tree
   * @return a list of integers representing the values of nodes visited in preorder
   */
  public List<Integer> preorderTraversal(TreeNode root) {

    // Create a list to store the values of the nodes in preorder
    List<Integer> nodeValues = new ArrayList<>();

    // Start the traversal from the root node
    return traverse(root, nodeValues);
  }

  /**
   * Helper method to recursively traverse the tree in preorder.
   *
   * @param node the current node being visited
   * @param values the list to store the values of visited nodes
   * @return the list of values collected during the traversal
   */
  private List<Integer> traverse(TreeNode node, List<Integer> values) {

    // Base case: if the current node is null, return the collected values
    if (node == null) {
      return values;
    }

    // Visit the current node and add its value to the list
    values.add(node.val);

    // Recursively traverse the left subtree
    traverse(node.left, values);
    // Recursively traverse the right subtree
    traverse(node.right, values);

    // Return the list of values collected during the traversal
    return values;
  }
}