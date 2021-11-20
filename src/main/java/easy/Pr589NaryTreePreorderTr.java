package easy;

import java.util.ArrayList;
import java.util.List;

import easy.models.Node;

public class Pr589NaryTreePreorderTr {

  public List<Integer> preorder(Node root) {

    List<Integer> nodeValues = new ArrayList<>();

    return traverse(root, nodeValues);
  }

  private List<Integer> traverse(Node node, List<Integer> values) {

    if (node == null) {
      return values;
    }

    values.add(node.val);

    if (node.children != null) {
      for (Node value : node.children) {
        traverse(value, values);
      }
    }

    return values;

  }

}
