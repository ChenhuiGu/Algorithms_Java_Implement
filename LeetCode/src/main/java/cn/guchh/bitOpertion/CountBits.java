package cn.guchh.bitOpertion;

/**
 * @author chenhuigu
 * 小于n的整数，二进制中1的个数
 */
public class CountBits {
    public int[] countBits(int n) {
        int[] res = new int[n+1];
        for (int i = 0; i <=n; i++) {
            res[i] = Integer.bitCount(i);
        }
        return res;
    }

    public int[] countBits01(int n) {
        int[] res = new int[n+1];
        for (int i = 0; i <=n; i++) {
            //偶数
            if((i&1) ==0){
                res[i] = res[i>>1];
            }else {
                res[i] = res[i-1] + 1;
            }
        }
        return res;
    }
}
