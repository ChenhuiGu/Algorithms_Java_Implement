package cn.guchh.dynamicProgramming;

/**
 * @author chenhuigu
 */
public class NumberOfArithmeticSlices {
    /**
     * 双指针
     * @param nums
     * @return
     */
    public int numberOfArithmeticSlices(int[] nums) {
        int n = nums.length;
        int res = 0;
        for (int i = 0; i < n-2;) {
            int j = i,d = nums[i+1] - nums[i];
            while (j<n-1 && nums[j+1]-nums[j] ==d){
                j++;
            }
            int len = j - i + 1;
            // a1：长度为 len 的子数组数量；an：长度为 3 的子数组数量
            int a1 = 1, an = len - 3 + 1;
            // 符合条件（长度大于等于3）的子数组的数量为「差值数列求和」结果
            int cnt = (a1 + an) * an / 2;
            res += cnt;
            i = j;
        }
        return res;
    }


    /**
     * 动态规划
     * @param nums
     * @return
     */
    public int numberOfArithmeticSlices01(int[] nums) {
        return 0;
    }
}
