package medium;

/**
 * LeetCode Problem 201: Maximum Area of an Island
 *
 * This class provides a solution for finding the maximum area of an island in a grid.
 * An island is defined as a group of connected '1's (land) surrounded by '0's (water).
 * The algorithm uses depth-first search (DFS) to calculate the area of each island and
 * keeps track of the maximum area found.
 */
public class Pr201LargestIsland {

  private int ROWS, COLS;

  /**
   * Calculates the maximum area of an island in the given grid.
   *
   * @param grid a 2D array representing the grid, where '1' represents land and '0' represents water
   * @return the maximum area of any island found in the grid
   */
  public int maxAreaOfIsland(int[][] grid) {
    if (grid == null || grid.length == 0) return 0; // Check for empty grid

    ROWS = grid.length; // Initialize the number of rows in the grid
    COLS = grid[0].length; // Initialize the number of columns in the grid

    int maxArea = 0; // Initialize maximum area

    for (int i = 0; i < ROWS; i++) {
      for (int j = 0; j < COLS; j++) {

        if (grid[i][j] == 1) {
          maxArea = Math.max(maxArea, dfs(grid, i, j)); // Update max area
        }
      }
    }

    return maxArea; // Return the maximum area found
  }

  /**
   * Performs a depth-first search (DFS) to calculate the area of an island.
   *
   * @param grid the grid representing the islands and water
   * @param i the current row index
   * @param j the current column index
   * @return the area of the island connected to the tile at (i, j)
   */
  private int dfs(int[][] grid, int i, int j) {
    if (outOfBounds(i, j) || grid[i][j] == 0) {
      return 0; // Exit if out of bounds or at water
    }

    grid[i][j] = 0; // Mark the current land tile as visited

    // Count the area by exploring all adjacent tiles (up, down, left, right)
    return 1 +
            dfs(grid, i + 1, j) +
            dfs(grid, i - 1, j) +
            dfs(grid, i, j + 1) +
            dfs(grid, i, j - 1);
  }

  /**
   * Checks if the given row and column indices are out of bounds of the grid.
   *
   * @param i the row index
   * @param j the column index
   * @return true if the indices are out of bounds, false otherwise
   */
  private boolean outOfBounds(int i, int j) {
    return i < 0 || i == ROWS || j < 0 || j == COLS; // Ensure indices are valid
  }
}