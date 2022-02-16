package cn.guchh.dynamicProgramming;

/**
 * @author chenhuigu
 */
public class NumArray {
    private int[] sums;
    public NumArray(int[] nums) {
        int n = nums.length;
        // 前缀和数组
        this.sums = new int[n+1];
        // index0占位
        for (int i = 0; i < n; i++) {
            sums[i+1] = sums[i] + nums[i];
        }
    }

    public int sumRange(int left, int right) {
        return sums[right+1] -sums[left];
    }
}
