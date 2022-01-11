package cn.guchh.array;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 众数
 * 最短子数组，众数的左右边界
 * @author chenhuigu
 */
public class FindShortestSubArray {
    public int findShortestSubArray(int[] nums) {
        int len = nums.length;
        Map<Integer,Integer> numCount = new HashMap<>();
        //元素的左右边界
        Map<Integer,Integer> right = new HashMap<>();
        Map<Integer,Integer> left = new HashMap<>();
        for (int i = 0; i < len; i++) {
            int key = nums[i];
            numCount.put(key,numCount.getOrDefault(key,0)+1);
            right.put(key,i);
            if(!left.containsKey(key)){
                left.put(key,i);
            }
        }
        //众数
        int maxNum = Collections.max(numCount.values());
        int res = len;
        for(int key:numCount.keySet()){
            if(numCount.get(key) == maxNum){
                res = Math.min(res,right.get(key)-left.get(key)+1);
            }
        }
        return res;
    }
}
