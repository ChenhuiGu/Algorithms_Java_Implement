package cn.guchh.array;

/**
 * 数组内存在重复数字[1，n]
 * length:n+1
 * 给定一个包含 n + 1 个整数的数组 nums ，其数字都在 1 到 n 之间（包括 1 和 n），可知至少存在一个重复的整数。
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

    public int findDuplicate2(int[] nums) {
        int len = nums.length;
        int right = 1,left = len - 1;
        while (right < left){
            int cnt = 0;
            int mid = right + ((left - right)>>1);
            for(int num:nums){
                if(num <= mid){
                    cnt ++;
                }
            }
            if(cnt > mid){
                left = mid;
            }else {
                right = mid+1;
            }
        }
        return left;
    }

}
