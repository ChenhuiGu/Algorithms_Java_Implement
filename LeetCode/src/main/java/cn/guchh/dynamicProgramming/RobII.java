package cn.guchh.dynamicProgramming;

import java.util.Arrays;

/**
 * @author chenhuigu
 */
public class RobII {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1){
            return nums[0];
        }
        return Math.max(myRob(Arrays.copyOfRange(nums,0,n-1)),
                        myRob(Arrays.copyOfRange(nums,1,n)));
    }
    private int myRob(int[] nums){
        int pre = 0,curr = 0;
        for(int num:nums){
            int temp = Math.max(curr,pre+num);
            pre = curr;
            curr = temp;
        }
        return curr;
    }
}
