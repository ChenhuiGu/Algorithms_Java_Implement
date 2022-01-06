package cn.guchh.bitOpertion;

/**
 * 交换律：a ^ b ^ c <=> a ^ c ^ b
 *
 * 任何数于0异或为任何数 0 ^ n => n
 *
 * 相同的数异或为0: n ^ n => 0
 *
 * var a = [2,3,2,4,4]
 *
 * 2 ^ 3 ^ 2 ^ 4 ^ 4等价于 2 ^ 2 ^ 4 ^ 4 ^ 3 => 0 ^ 0 ^3 => 3
 *
 * @author chenhuigu
 */
public class SingleNumber {

    class Solution {
        public int singleNumber(int[] nums) {
            int res = nums[0];
            for(int i=1;i<nums.length;i++){
                res &= nums[i];
            }
            return res;
        }
    }
}


