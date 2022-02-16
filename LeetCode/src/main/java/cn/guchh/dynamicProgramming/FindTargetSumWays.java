package cn.guchh.dynamicProgramming;

/**
 * @author chenhuigu
 */
public class FindTargetSumWays {
    /**
     * 转化为0-1背包
     * @param nums
     * @param target
     * @return
     */
    public int findTargetSumWays(int[] nums, int target) {
        int len = nums.length;
        if(len == 1){
            if(nums[0] == target){
                return 1;
            }else {
                return 0;
            }
        }
        int sum = 0;
        for(int num:nums){
            sum += num;
        }
        if(((sum-target) & 1) == 1){
            return 0;
        }
        target = (sum -target)>>1;
        int[][] dp = new int[len][target+1];
        for (int i = 0; i < len; i++) {
            dp[i][0] = 1;
        }
        if(nums[0] <= target){
            dp[0][nums[0]] = 1;
        }
        for (int i = 1; i < len; i++) {
            for (int j = 1; j < target+1; j++) {
                if(nums[i] == j){
                    dp[i][j] = dp[i-1][j] +1;
                }else if(nums[i] < j){
                    dp[i][j] = dp[i-1][j] + dp[i-1][j-nums[i]];
                }else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[len-1][target];
    }
}
