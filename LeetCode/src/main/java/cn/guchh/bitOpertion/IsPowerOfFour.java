package cn.guchh.bitOpertion;

/**
 * @author chenhuigu
 */
public class IsPowerOfFour {
    class Solution {
        public boolean isPowerOfFour(int n) {
            // 有且仅有一个1位于二进制的奇数位
            return n > 0 && (n&(n-1))==0 && (n&(0x55555555))!=0;
        }
    }
}
