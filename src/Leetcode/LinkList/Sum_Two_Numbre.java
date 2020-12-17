/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Output: Because nums[0] + nums[1] == 9, we return [0, 1].
 *
 * Java HashMap
 * 散列表
 * 红黑树 --> 二叉树
 */
package Leetcode.LinkList;
import java.util.HashMap;

public class Sum_Two_Numbre {
    public static void main(String[] args) {
        int[] l1 = {1,2,3,4,5,6,7,8,9};
        int[] l2 = Solution.twoSum(l1,16);
        for(int item:l2){
            System.out.println(item);
        }
    }

}

class Solution {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hashMap = new HashMap<Integer,Integer>();
        for (int i=0;i<nums.length;i++) {
            //索引为Value
            hashMap.put(nums[i],i);
        }
        for (int i=0;i<nums.length;i++) {
            int complete = target - nums[i];
            if(hashMap.containsKey(complete) && hashMap.get(complete) != i){
                return new int []{i,hashMap.get(complete)};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}