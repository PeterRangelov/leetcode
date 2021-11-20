package easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import easy.models.Node;

public class Pr589NaryTreePreorderTrTest {

  Pr589NaryTreePreorderTr pr;

  private static Stream<Arguments> provideData() {

    List<Integer> preOrderValues = Arrays.asList(1, 3, 5, 6, 2, 4);

    Node n1 = new Node(1);
    Node n3 = new Node(3);
    Node n5 = new Node(5);
    Node n6 = new Node(6);
    Node n2 = new Node(2);
    Node n4 = new Node(4);

    n1.children = Arrays.asList(n3, n2, n4);
    n3.children = Arrays.asList(n5, n6);

    return Stream.of(
      Arguments.of(n1, preOrderValues)
    );
  }

  @BeforeEach
  void setup() {
    pr = new Pr589NaryTreePreorderTr();
  }

  @ParameterizedTest
  @MethodSource("provideData")
  void testAll(Node root, List<Integer> inOrderValues) {
    assertEquals(inOrderValues, pr.preorder(root));
  }


}
