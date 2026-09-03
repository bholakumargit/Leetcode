class Solution {

    int[][] dp;

    public int longestIncreasingPath(int[][] matrix) {

        int r = matrix.length;
        int c = matrix[0].length;

        dp = new int[r][c];

        int ans = 0;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                ans = Math.max(ans, dfs(matrix, i, j));
            }
        }

        return ans;
    }

    int dfs(int[][] a, int i, int j) {

        // Already calculated
        if (dp[i][j] != 0)
            return dp[i][j];

        dp[i][j] = 1;

        // Down
        if (i + 1 < a.length && a[i + 1][j] > a[i][j])
            dp[i][j] = Math.max(dp[i][j], 1 + dfs(a, i + 1, j));

        // Up
        if (i - 1 >= 0 && a[i - 1][j] > a[i][j])
            dp[i][j] = Math.max(dp[i][j], 1 + dfs(a, i - 1, j));

        // Right
        if (j + 1 < a[0].length && a[i][j + 1] > a[i][j])
            dp[i][j] = Math.max(dp[i][j], 1 + dfs(a, i, j + 1));

        // Left
        if (j - 1 >= 0 && a[i][j - 1] > a[i][j])
            dp[i][j] = Math.max(dp[i][j], 1 + dfs(a, i, j - 1));

        return dp[i][j];
    }
}