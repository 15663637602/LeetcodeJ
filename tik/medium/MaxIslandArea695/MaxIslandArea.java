package medium.MaxIslandArea695;

public class MaxIslandArea {
    final static int[][] DIRS = {{0,1}, {0, -1}, {1, 0}, {-1, 0}};
    public int maxAreaOfIsland(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        final int row = grid.length;
        final int col = grid[0].length;
        int res = 0;
        boolean[][] visited = new boolean[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 1 && !visited[i][j]) {
                    res = Math.max(res, dfs(i, j, grid, visited));
                }
            }
        }
        return res;
    }

    private int dfs(int i, int j, int[][] grid, boolean[][] visited) {
        visited[i][j] = true;
        int area = 1;
        for (int[] DIR : DIRS) {
            int newRow = i + DIR[0];
            int newCol = j + DIR[1];
            if (grid[newRow][newCol] == 1 && !visited[newRow][newCol] && checkBoundary(grid, newRow, newCol)) {
                area += dfs(newRow, newCol, grid, visited);
            }
        }
        return area;
    }

    private boolean checkBoundary(int[][] grid, int i, int j) {
        final int row = grid.length;
        final int col = grid[0].length;
        return i >= 0 && i < row && j >= 0 && j < col;
    }
}
