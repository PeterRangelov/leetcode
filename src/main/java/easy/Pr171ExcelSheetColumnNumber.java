package easy;

public class Pr171ExcelSheetColumnNumber {

  public int titleToNumber(String columnTitle) {

    int cols = 0;

    for (int i = 0; i <= columnTitle.length() - 1; i++) {
      int lettersFromA = columnTitle.charAt(i) - 'A' + 1;
      cols *= 26;
      cols += lettersFromA;
    }
    int x = 1;
    int y = 7;
    
    return cols;

  }

}
