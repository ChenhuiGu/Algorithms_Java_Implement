package cn.guchh.array;

/**
 * 数组内存在重复数字[1，n]
 * length:n+1
 * @author chenhuigu
 */
public class FindDuplicate {
    /**
     * 快慢指针
     * @param nums
     * @return
     */
    public int findDuplicate(int[] nums) {
        int fast = 0,slow = 0;
        do{
            fast = nums[nums[fast]];
            slow = nums[slow];
        }while (fast != slow);
        fast = nums[0];
        while (fast != slow){
            fast = nums[fast];
            slow = nums[slow];

        }
        return fast;
    }
}
