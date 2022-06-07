class Solution {
    int[][] memo;
    public int uniquePaths(int m, int n) {
        memo = new int[m][n];
        return helper(0, 0, m, n);
    }
    int helper(int r, int c, int m, int n) {
        if(r==m-1 && c==n-1)
            return 1;
        if(r>=m || c>=n)
            return 0;
        if(memo[r][c] != 0)
            return memo[r][c];
        memo[r][c]=helper(r+1, c, m, n) + helper(r, c+1, m, n);
        return memo[r][c];
    }
}