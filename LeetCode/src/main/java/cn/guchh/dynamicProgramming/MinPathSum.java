package cn.guchh.dynamicProgramming;

/**
 * @author chenhuigu
 */
public class MinPathSum {
    /**
     * 创建dp二维数组
     * O(MN)
     * @param grid
     * @return
     */
    public int minPathSum(int[][] grid) {
        int m=grid.length,n=grid[0].length;
        int[][] dp = new int[m][n];
        dp[0][0] = grid[0][0];
        for (int i = 1; i < m; i++) {
            dp[i][0] = dp[i-1][0] +grid[i][0];
        }
        for (int j = 1; j < n; j++) {
            dp[0][j] = dp[0][j-1] +grid[0][j];
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = Math.min(dp[i-1][j],dp[i][j-1]) + grid[i][j];
            }
        }
        return dp[m-1][n-1];
    }

    /**
     * 原地修改数组
     * @param grid
     * @return
     */
    public int minPathSum02(int[][] grid) {
        int m=grid.length,n=grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(i==0 && j==0){
                }else if(i==0){
                    grid[0][j] += grid[0][j-1];
                }else if(j==0){
                    grid[i][0] += grid[i-1][0];
                }else {
                    grid[i][j] += Math.min(grid[i-1][j],grid[i][j-1]);
                }
            }
        }
        return grid[m-1][n-1];
    }
}
