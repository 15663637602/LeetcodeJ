package medium.MaxDistanceFromLand1162;

import java.util.ArrayDeque;
import java.util.Queue;

public class MaxDFromLand {
    final static int[][] DIRS = {{0,1}, {0, -1}, {1, 0}, {-1, 0}};
    Queue<int[]> queue = new ArrayDeque<>();

    public int maxDistance(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        final int row = grid.length;
        final int col = grid[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 1) {
                    queue.offer(new int[] {i, j});
                }
            }
        }

        int[] tmp = null;
        boolean hasOcean = false;
        boolean hasLand = false;

        while (!queue.isEmpty()) {
            hasLand = true;
            tmp = queue.poll();
            int x = tmp[0];
            int y = tmp[1];
            for (int[] DIR: DIRS) {
                int newRow = x + DIR[0];
                int newCol = y + DIR[1];
                if (newRow < 0 || newRow >= row || newCol < 0 || newCol >= col || grid[newRow][newCol] != 0) {
                    continue;
                }
                hasOcean = true;
                grid[newRow][newCol] = grid[x][y] + 1;
                queue.offer(new int[] {newRow, newCol});
            }
        }

        if (!hasLand || !hasOcean) {
            return -1;
        }
        return grid[tmp[0]][tmp[1]] - 1;
    }

}
