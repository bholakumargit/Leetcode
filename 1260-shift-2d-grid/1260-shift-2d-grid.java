class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int n = grid.length, m = grid[0].length;
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < n; i++)
            ans.add(new ArrayList<>(Collections.nCopies(m, 0)));

        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++) {
                int x = (i * m + j + k) % (n * m);
                ans.get(x / m).set(x % m, grid[i][j]);
            }

        return ans;
    }
}