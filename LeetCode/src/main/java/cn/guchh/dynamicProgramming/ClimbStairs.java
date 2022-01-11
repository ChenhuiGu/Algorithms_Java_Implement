package cn.guchh.dynamicProgramming;

/**
 * @author chenhuigu
 */
public class ClimbStairs {
    public int climbStairs(int n) {
        if(n==1 ||n==2){
            return n;
        }
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }

    /**
     * 状态压缩
     * @param n
     * @return
     */
    public int climbStairs01(int n) {
        if(n==1 ||n==2){
            return n;
        }
        int p=1,q=2,sum=0;
        for (int i = 3; i <= n; i++) {
            sum = p + q;
            p = q;
            q = sum;
        }
        return sum;
    }
}
