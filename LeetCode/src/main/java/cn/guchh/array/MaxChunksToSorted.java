package cn.guchh.array;

/**
 * @author chenhuigu
 */
public class MaxChunksToSorted {
    public int maxChunksToSorted(int[] arr) {
        int res = 0,max = 0;
        for (int i = 0; i < arr.length; i++) {
            //前i个元素(包括i)的最大值
            max = Math.max(max,arr[i]);
            if(i == max){
                res++;
            }
        }
        return res;
    }
}
