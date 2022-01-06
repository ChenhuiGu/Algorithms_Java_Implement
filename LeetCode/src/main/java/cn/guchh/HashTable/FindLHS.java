package cn.guchh.HashTable;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindLHS {
}

class SolutionLhs {
    /**
     * 594. 最长和谐子序列，哈希表
     *
     * @param nums
     * @return
     */
    public int findLHS(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int max = 0;
        for (int i : map.keySet()) {
            int next;
            if ((next = map.getOrDefault(i + 1, 0)) != 0) {
                max = Math.max(map.get(i) + next, max);
            }
        }
        return max;
    }

    /**
     * 排序 + 滑动窗口
     *
     * @param nums
     * @return
     */
    public int findLHSSliding(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        //子序列的起始元素
        int begin = 0;
        int n = nums.length;
        for (int end = 0; end < n; end++) {
            while (nums[end] - nums[begin] > 1) {
                begin++;
            }
            if (nums[end] - nums[begin] == 1) {
                ans = Math.max(ans, end - begin + 1);
            }

        }
        return ans;
    }
}

