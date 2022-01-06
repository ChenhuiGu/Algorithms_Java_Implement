package cn.guchh.array;

/**
 * @author chenhuigu
 */
public class FindErrorNums {
    /**
     * 哈希表
     * @param nums
     * @return
     */
    public int[] findErrorNums01(int[] nums) {
        //数组表征哈希表
        //空出0的位置
        int[] hash = new int[nums.length+1];
        int[] res = new int[2];
        for(int num:nums){
            hash[num]++;
        }
        for (int i = 1; i < hash.length; i++) {
            if(hash[i] == 2){
                res[0] = i;
            }else if(hash[i] == 0){
                res[1] = i;
            }
        }
        return res;
    }

    /**
     * 桶排序，原地排序
     * O(n) O(1)
     * @param nums
     * @return
     */
    public int[] findErrorNums02(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != i+1 && nums[nums[i]-1] !=nums[i]){
                swap(nums,i,nums[i]-1);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != i+1){
                return new int[] {nums[i],i+1};
            }
        }
        return null;
    }

    public void swap(int[] nums,int i,int j){
        nums[i] = nums[i]^nums[j];
        nums[j] = nums[i]^nums[j];
        nums[i] = nums[i]^nums[j];
    }
}
