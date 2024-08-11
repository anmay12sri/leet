class Solution {

    public int minDays(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        if (!connected(grid, m, n)) {
            return 0;
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    grid[i][j] = 0;
                    if (!connected(grid, m, n)) {
                        return 1;
                    }
                    grid[i][j] = 1;
                }
            }
        }
        return 2;
    }

    public boolean connected(int[][] grid, int m, int n) {
        boolean[][] visit = new boolean[m][n];
        int[] st = findfirstland(grid, m, n);

        if (st[0] == -1) {
            return false;
        }

        dfs(grid, visit, st[0], st[1], m, n);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1 && !visit[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public void dfs(int[][] grid, boolean[][] visit, int x, int y, int m, int n) {
        if (x < 0 || x >= m || y < 0 || y >= n || grid[x][y] == 0 || visit[x][y]) {
            return;
        }

        visit[x][y] = true;

        dfs(grid, visit, x + 1, y, m, n);  
        dfs(grid, visit, x - 1, y, m, n);  
        dfs(grid, visit, x, y + 1, m, n);  
        dfs(grid, visit, x, y - 1, m, n);
    }

    public int[] findfirstland(int[][] grid, int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
