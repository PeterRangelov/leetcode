package easy;

import java.util.ArrayList;
import java.util.List;

import easy.models.TreeNode;

public class Pr144BinTreePreorderTr {

  public List<Integer> preorderTraversal(TreeNode root) {

    List<Integer> nodeValues = new ArrayList<>();

    return traverse(root, nodeValues);
  }

  private List<Integer> traverse(TreeNode node, List<Integer> values) {

    if (node == null) {
      return values;
    }

    values.add(node.val);
    
    traverse(node.left, values);
    traverse(node.right, values);

    return values;

  }

}
