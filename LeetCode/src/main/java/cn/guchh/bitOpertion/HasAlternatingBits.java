package cn.guchh.bitOpertion;

/**
 * @author chenhuigu
 */
public class HasAlternatingBits {
    class Solution {
        //private static final int M1 = 0x55555555;
        //private static final int M2 = 0xaaaaaaaa;
        public boolean hasAlternatingBits(int n) {
            n = n^(n>>1);
            return (n&(n+1))==0;
        }
    }
}
