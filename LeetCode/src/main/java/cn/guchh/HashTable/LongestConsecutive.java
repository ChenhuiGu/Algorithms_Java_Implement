package cn.guchh.HashTable;

import java.util.HashMap;
import java.util.Map;

/**
 * @author chenhuigu
 */
public class LongestConsecutive {

}

class SolutionLc {
    public int longestConsecutive(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0) +1);
        }
        int ans = 0;
        for(int i:map.keySet()){
            if(!map.containsKey(i-1)){
                int length = 1;
                while(map.containsKey(i+1)){
                    length += 1;
                    i += 1;
                }
                ans = Math.max(ans,length);
            }

        }
        return ans;
    }
}