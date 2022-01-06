package cn.guchh.bitOpertion;

/**
 * 排序比较
 * 原地哈希
 * 异或
 * @author chenhuigu
 */
public class MissingNumber {

    class Solution {
        public int missingNumber(int[] nums) {
            int length = nums.length;
            int res = nums[0];
            for (int i = 1; i < length; i++) {
                res = res^i^nums[i];
            }
            return res^length;
        }
    }

}

