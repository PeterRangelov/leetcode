package medium;

public class Pr201LargestIsland {

  private int ROWS, COLS;

  public int maxAreaOfIsland(int[][] grid) {

    ROWS = grid.length;
    COLS = grid[0].length;

    int maxArea = 0;

    for (int i = 0; i < ROWS; i++) {
      for (int j = 0; j < COLS; j++) {

        if (grid[i][j] == 1) {
          maxArea = Math.max(maxArea, dfs(grid, i, j));
        }

      }
    }

    return maxArea;
  }

  private int dfs(int[][] grid, int i, int j) {

    if (outOfBounds(i, j) || grid[i][j] == 0) {
      return 0;
    }

    grid[i][j] = 0;

    return 1 +
      dfs(grid, i + 1, j) +
      dfs(grid, i - 1, j) +
      dfs(grid, i, j + 1) +
      dfs(grid, i, j - 1);

  }

  private boolean outOfBounds(int i, int j) {
    return i < 0 || i == ROWS || j < 0 || j == COLS;
  }

}
