package cn.guchh.array;

/**
 * @author chenhuigu
 * 编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 */
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int len = nums.length;
        int i =0,j = 0;
        while (i<len && j<len){
            if(nums[j] == 0){
                j++;
            }else {
                if(nums[i] != 0){
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i++] = temp;
                }

            }
        }
    }
    public void moveZeroes01(int[] nums) {
        if(nums == null) {
            return;
        }
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0){
                int temp = nums[j];
                nums[j++] = nums[i];
                nums[i] = temp;
            }
        }
    }

}
