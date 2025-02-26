package medium;

/**
 * LeetCode Problem 200: Number of Islands
 *
 * This class provides a solution for counting the number of islands in a grid.
 * An island is defined as a group of connected '1's (land) surrounded by '0's (water).
 * The algorithm uses depth-first search (DFS) to traverse the grid and count the islands.
 */
public class Pr200NumIslands {

  private int ROWS, COLS;

  /**
   * Counts the number of islands in the given grid.
   *
   * @param grid a 2D array representing the grid, where '1' represents land and '0' represents water
   * @return the number of islands found in the grid
   */
  public int numIslands(char[][] grid) {
    if (grid == null || grid.length == 0) return 0; // Check for empty grid

    ROWS = grid.length; // Initialize the number of rows in the grid
    COLS = grid[0].length; // Initialize the number of columns in the grid

    int count = 0; // Initialize island count

    for (int i = 0; i < ROWS; i++) {
      for (int j = 0; j < COLS; j++) {

        // Find a land tile
        if (grid[i][j] == '1') {
          count++; // Increment island count
          dfs(grid, i, j); // Perform DFS to mark all connected land tiles
        }
      }
    }

    return count; // Return the total number of islands found
  }

  /**
   * Performs a depth-first search (DFS) to mark all connected land tiles as visited.
   *
   * @param grid the grid representing the islands and water
   * @param i the current row index
   * @param j the current column index
   */
  private void dfs(char[][] grid, int i, int j) {
    // Check if the current position is out of bounds or is water
    if (!isInBounds(i, j) || grid[i][j] == '0') {
      return; // Exit the recursion
    }

    grid[i][j] = '0'; // Mark the current land tile as visited

    // Explore all adjacent tiles (up, down, left, right)
    dfs(grid, i + 1, j);
    dfs(grid, i - 1, j);
    dfs(grid, i, j + 1);
    dfs(grid, i, j - 1);
  }

  /**
   * Checks if the given row and column indices are within the bounds of the grid.
   *
   * @param r the row index
   * @param c the column index
   * @return true if the indices are within bounds, false otherwise
   */
  private boolean isInBounds(int r, int c) {
    return r < ROWS && r >= 0 && c < COLS && c >= 0; // Ensure indices are valid
  }
}