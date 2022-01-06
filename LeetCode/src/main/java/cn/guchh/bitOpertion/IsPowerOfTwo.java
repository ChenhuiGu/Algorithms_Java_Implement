package cn.guchh.bitOpertion;

/**
 * @author chenhuigu
 */
public class IsPowerOfTwo {
    class Solution {
        public boolean isPowerOfTwo(int n) {
            //n必须大于零
            return n >0 && (n&(n-1))==0;
        }
    }
}
