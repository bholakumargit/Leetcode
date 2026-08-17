class Solution {
    public int[][] construct2DArray(int[] a, int m, int n) {
        if (a.length != m * n) return new int[0][0];

        int[][] b = new int[m][n];
        int k = 0;

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                b[i][j] = a[k++];

        return b;
    }
}