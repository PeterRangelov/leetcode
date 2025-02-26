package easy;

import java.util.ArrayList;
import java.util.List;

import easy.models.Node;

/**
 * This class provides a solution to LeetCode Problem 589: N-ary Tree Preorder Traversal.
 * It implements a method to perform a preorder traversal of an N-ary tree.
 */
public class Pr589NaryTreePreorderTr {

  /**
   * Performs a preorder traversal of the N-ary tree.
   *
   * @param root the root node of the N-ary tree
   * @return a list of node values in preorder
   */
  public List<Integer> preorder(Node root) {
    // List to store the values of nodes during traversal
    List<Integer> nodeValues = new ArrayList<>();
    // Start the traversal from the root node
    return traverse(root, nodeValues);
  }

  /**
   * Helper method to traverse the N-ary tree recursively.
   *
   * @param node the current node being visited
   * @param values the list of values collected during traversal
   * @return the list of node values
   */
  private List<Integer> traverse(Node node, List<Integer> values) {
    // Base case: if the current node is null, return the collected values
    if (node == null) {
      return values;
    }

    // Add the current node's value to the list
    values.add(node.val);

    // Traverse the children of the current node
    if (node.children != null) {
      for (Node child : node.children) {
        traverse(child, values);
      }
    }

    return values; // Return the list of values after traversing all children
  }
}