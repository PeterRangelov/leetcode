package easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import easy.models.TreeNode;

public class Pr94BinTreeInorderTrTest {

  Pr94BinTreeInorderTr pr;

  private static Stream<Arguments> provideData() {

    List<Integer> inOrderValues = Arrays.asList(7, 11, 2, 4, 5, 13, 8, 4, 1);

    TreeNode n5 = new TreeNode(5);
    TreeNode n4 = new TreeNode(4);
    TreeNode n8 = new TreeNode(8);
    TreeNode n11 = new TreeNode(11);
    TreeNode n13 = new TreeNode(13);
    TreeNode n4R = new TreeNode(4);
    TreeNode n7 = new TreeNode(7);
    TreeNode n2 = new TreeNode(2);
    TreeNode n1 = new TreeNode(1);

    n5.left = n4;
    n5.right = n8;
    n4.left = n11;
    n11.left = n7;
    n11.right = n2;
    n8.left = n13;
    n8.right = n4R;
    n4R.right = n1;

    return Stream.of(
      Arguments.of(n5, inOrderValues)
    );
  }

  @BeforeEach
  void setup() {
    pr = new Pr94BinTreeInorderTr();
  }

  @ParameterizedTest
  @MethodSource("provideData")
  void testAll(TreeNode root, List<Integer> inOrderValues) {
    assertEquals(inOrderValues, pr.inorderTraversal(root));
  }


}
