package cn.guchh.bitOpertion;

/**
 * @author chenhuigu
 */
public class HammingDistance {

    class Solution {
        public int hammingDistance0(int x, int y) {
            int n = x^y,count = 0;
            while (n != 0){
                count += n&1;
                n = n>>1;
            }
            return count;
        }

        public int hammingDistance1(int x, int y) {
            return Integer.bitCount(x^y);
        }

        public int hammingDistance2(int x, int y) {
            int n = x^y,count = 0;
            while (n != 0){
                n &= n-1;
                count++;
            }
            return count;
        }
    }

}


