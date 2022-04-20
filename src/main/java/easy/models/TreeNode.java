package easy.models;

public class TreeNode {

  public int val;
  public TreeNode left;
  public TreeNode right;

  TreeNode() {
  }

  public TreeNode(int val) {
    this.val = val;
  }

  public TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }

  //  public TreeNode(Integer[] nodeVals) {
  //
  //    for (int left = 1, right = 2, depth = 1; left < nodeVals.length && right < nodeVals.length; left +=) {
  //      this.val = nodeVal;
  //
  //    }
  //
  //    TreeNode root = new TreeNode(nodeVals[0]);
  //
  //    Queue<TreeNode> nodeQueue = new LinkedList<>();
  //    nodeQueue.add(root);
  //
  //    while (!nodeQueue.isEmpty()) {
  //      TreeNode current = nodeQueue.poll();
  //
  //    }
//
//  }

}
