package easy;

/**
 * This class provides a solution to LeetCode Problem 171: Excel Sheet Column Number.
 * It contains a method to convert a column title from an Excel sheet (e.g., "A", "B", ..., "Z", "AA", "AB", ...)
 * into its corresponding column number.
 */
public class Pr171ExcelSheetColumnNumber {

  /**
   * Converts an Excel column title to its corresponding column number.
   *
   * @param columnTitle the column title to convert (e.g., "A", "B", "C", ..., "Z", "AA", "AB", ...)
   * @return the corresponding column number
   */
  public int titleToNumber(String columnTitle) {

    // Initialize the column number to 0
    int cols = 0;

    // Iterate through each character in the column title
    for (int i = 0; i <= columnTitle.length() - 1; i++) {
      // Calculate the numeric value of the current letter (A=1, B=2, ..., Z=26)
      int lettersFromA = columnTitle.charAt(i) - 'A' + 1;
      // Shift the previous value of cols by one place to the left (multiply by 26)
      cols *= 26;
      // Add the current letter's value to cols
      cols += lettersFromA;
    }

    // The variables x and y are unused; consider removing them for clarity
    int x = 1; // Unused variable
    int y = 7; // Unused variable

    // Return the final column number
    return cols;
  }
}