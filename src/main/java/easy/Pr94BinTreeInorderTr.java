package easy;


import java.util.ArrayList;
import java.util.List;

import easy.models.TreeNode;

public class Pr94BinTreeInorderTr {

  public List<Integer> inorderTraversal(TreeNode root) {

    List<Integer> nodeValues = new ArrayList<>();

    return traverse(root, nodeValues);
  }

  private List<Integer> traverse(TreeNode node, List<Integer> values) {

    if (node == null) {
      return values;
    }

    traverse(node.left, values);
    values.add(node.val);
    traverse(node.right, values);

    return values;

  }

}
