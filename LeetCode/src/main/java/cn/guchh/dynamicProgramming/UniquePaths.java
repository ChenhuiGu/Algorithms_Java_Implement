package cn.guchh.dynamicProgramming;

import java.util.Arrays;

/**
 * @author chenhuigu
 */
public class UniquePaths {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(i==0){
                    dp[0][j] = 1;
                }else if(j==0){
                    dp[i][0] = 1;
                }else {
                    dp[i][j] = dp[i][j-1] + dp[i-1][j];
                }
            }
        }
        return dp[m-1][n-1];
    }

    public int uniquePaths01(int m, int n) {
        // 当前行
        int[] cur = new int[n];
        // 第一行
        Arrays.fill(cur,1);
        for (int i = 0; i < m; i++) {
            // j=0永远是1，不用更新
            for (int j = 1; j < n; j++) {
                //替换为下一行数据
                cur[j] = cur[j] + cur[j-1];
            }
        }
        return cur[n-1];
    }

}
