package cn.guchh.array;

/**
 * @author chenhuigu
 */
public class FindMaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int res = 0;
        int count = 0;
        for(int num:nums){
            if(num == 0){
                res = Math.max(res,count);
                count = 0;
            }else {
               count++;
            }
        }
        return Math.max(res,count);
    }
}
