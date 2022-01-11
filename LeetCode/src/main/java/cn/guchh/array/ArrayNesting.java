package cn.guchh.array;

/**
 * @author chenhuigu
 */
public class ArrayNesting {
    /**
     * 暴力
     * @param nums
     * @return
     */
    public int arrayNesting(int[] nums) {
        int res = 0;
        for (int num : nums) {
            int j = num, count = 0;
            do {
                j = nums[j];
                count++;
            } while (j != num);
            res = Math.max(res, count);
        }
        return res;
    }
    public int arrayNesting01(int[] nums) {
        int res = 0;
        for (int num : nums) {
            // 元素未被访问
            if(num != -1){
                //初始值
                int start = num,count = 0;
                while (nums[start] != -1){
                    count++;
                    int temp = start;
                    start = nums[start];
                    nums[temp] = -1;
                }
                res = Math.max(res, count);
            }
        }
        return res;
    }
}
