package medium;

public class Pr200NumIslands {

  private int ROWS, COLS;

  public int numIslands(char[][] grid) {

    this.ROWS = grid.length - 1;
    this.COLS = grid[0].length - 1;

    int count = 0;

    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[i].length; j++) {

        // find a land tile
        if (grid[i][j] == '1') {
          count++;
          dfs(grid, i, j);
        }

      }
    }

    return count;
  }

  private void dfs(char[][] grid, int i, int j) {

    if (!isInBounds(i, j) || grid[i][j] == '0') {
      return;
    }

    grid[i][j] = '0';

    dfs(grid, i + 1, j);
    dfs(grid, i - 1, j);
    dfs(grid, i, j + 1);
    dfs(grid, i, j - 1);

  }

  private boolean isInBounds(int r, int c) {
    return r <= ROWS && r >= 0 &&
      c <= COLS && c >= 0;
  }

}
