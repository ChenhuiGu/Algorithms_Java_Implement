package cn.guchh.bitOpertion;

import java.util.HashMap;
import java.util.Map;

/**
 * @author chenhuigu
 */
public class MaxProduct {

    class Solution {
        public int maxProduct(String[] words) {
            Map<Integer,Integer> map = new HashMap<>();
            for(String str:words){
                // 26位二进制
                int mask = 0;
                int len = str.length();
                for (int i = 0; i < len; i++) {
                    mask |= 1<<(str.charAt(i) - 'a');
                }
                if(len > map.getOrDefault(mask,0)){
                    map.put(mask,len);
                }
            }
            int maxLength = 0;
            for(int a:map.keySet()){
                for(int b:map.keySet()){
                    if((a&b) == 0){
                        maxLength = Math.max(map.get(a)*map.get(b),maxLength);
                    }
                }
            }
            return maxLength;
        }
    }
}
