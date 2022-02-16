package cn.guchh.dynamicProgramming;

import com.google.common.annotations.VisibleForTesting;
import org.testng.annotations.Test;

import java.util.Arrays;

/**
 * @author chenhuigu
 */
public class CanPartition {
    /**
     * 反例：[1,2,5],[2,2,3,5]
     *
     * @param nums
     * @return
     */
    public boolean canPartition(int[] nums) {
        int sum = 0, max = 0;
        for (int num : nums) {
            sum += num;
            max = Math.max(num, max);
        }
        if ((sum & 1) == 1) {
            return false;
        }

        return max <= sum >> 1;
    }

    /**
     * 二维数组，动态规划
     *
     * @param nums
     * @return
     */
    public boolean canPartition01(int[] nums) {
        int sum = 0, len = nums.length, maxNum = 0;
        //数组长度小于2
        if (len < 2) {
            return false;
        }
        for (int num : nums) {
            sum += num;
            maxNum = Math.max(num, maxNum);
        }
        //奇数
        if ((sum & 1) == 1) {
            return false;
        }
        int target = sum >> 1;
        //最大值超过平均数
        if (target < maxNum) {
            return false;
        }
        boolean[][] dp = new boolean[len][target + 1];
        // 如果不选取任何正整数，则被选取的正整数等于0。
        // 因此对于所有0<=i<n，都有dp[i][0]=true。
        for (int i = 0; i <len; i++) {
            dp[i][0] = true;
        }
        // 最大值 < target,只有一个值可以选
        dp[0][nums[0]] = true;
        for (int i = 1; i < len; i++) {
            for (int j = 1; j < target+1; j++) {
                if(j == nums[i]){
                    dp[i][j] = true;
                }else if(nums[i] < j){
                    dp[i][j] = dp[i-1][j] || dp[i-1][j-nums[i]];
                }else {
                    dp[i][j] = dp[i-1][j];
                }

            }
        }
        System.out.println(Arrays.deepToString(dp));
        return dp[len-1][target];
    }

    /**
     * 空间优化
     * @param nums
     * @return
     */
    public boolean canPartition02(int[] nums) {
        int sum = 0, len = nums.length, maxNum = 0;
        //数组长度小于2
        if (len < 2) {
            return false;
        }
        for (int num : nums) {
            sum += num;
            maxNum = Math.max(num, maxNum);
        }
        //奇数
        if ((sum & 1) == 1) {
            return false;
        }
        int target = sum >> 1;
        //最大值超过平均数
        if (target < maxNum) {
            return false;
        }
        boolean[] dp = new boolean[target];
        // 最大值 < target,只有一个值可以选
        dp[nums[0]] = true;
        for (int i = 1; i < len; i++) {
            for (int j = 0; j < target+1; j++) {
                if(j == nums[i]){
                    dp[j] = true;
                }else if(nums[i] < j){
                    dp[j] = dp[j] || dp[j-nums[i]];
                }
            }
        }
        //System.out.println(Arrays.deepToString(dp));
        return dp[target];
    }

    public static void main(String[] args) {
        CanPartition canPartition = new CanPartition();
        int[] arr = new int[]{1,5,11,5};
        canPartition.canPartition01(arr);
    }
}
