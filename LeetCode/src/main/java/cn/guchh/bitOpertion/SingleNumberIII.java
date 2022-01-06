package cn.guchh.bitOpertion;

/**
 * @author chenhuigu
 */
public class SingleNumberIII {

    class Solution {
        public int[] singleNumber(int[] nums) {
            int diff = 0;
            for(int num:nums){
                diff ^= num;
            }
            diff = diff & (-diff);//最低位1
            int[] arr = new int[2];
            for (int num : nums) {
                if ((diff & num) == 0) {
                    arr[0] ^= num;
                } else {
                    arr[1] ^= num;
                }
            }
            return arr;

        }
    }
}
