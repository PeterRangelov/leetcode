import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import easy.Pr171ExcelSheetColumnNumber;

public class Tests {
  private Pr171ExcelSheetColumnNumber pr;

  @BeforeEach
  void setup() {
    pr = new Pr171ExcelSheetColumnNumber();
  }

  @Test
  void test_A() {
    assertEquals(1, pr.titleToNumber("A"));
  }

  @Test
  void test_C() {
    assertEquals(3, pr.titleToNumber("C"));
  }

  @Test
  void test_AB() {
    assertEquals(28, pr.titleToNumber("AB"));
  }

  @Test
  void test_ZY() {
    assertEquals(701, pr.titleToNumber("ZY"));
  }

  @Test
  void test_FXSHRXW() {
    assertEquals(2147483647, pr.titleToNumber("FXSHRXW"));
  }
}
