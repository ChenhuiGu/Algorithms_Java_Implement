package cn.guchh.dynamicProgramming;

/**
 * @author chenhuigu
 */
public class Rob {
    public int rob(int[] nums) {
        int n;
        if((n = nums.length) ==0){
            return 0;
        }
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = nums[1];
        for (int i = 2; i <= n; i++) {
            dp[i] = Math.max(dp[i-1],dp[i-2]+nums[i-1]);
        }
        return dp[n];
    }

    public int rob01(int[] nums) {
        int n;
        if((n = nums.length) ==0){
            return 0;
        }else if(n==1){
            return nums[0];
        }
        int p=0,q=nums[0],sum=0;
        for (int i = 2; i <= n; i++) {
            sum = Math.max(q,p+nums[i-1]);
            p = q;
            q = sum;
        }
        return sum;

    }
}
