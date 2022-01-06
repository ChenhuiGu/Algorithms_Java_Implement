package cn.guchh.HashTable;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @author chenhuigu
 */
public class ContainsDuplicate {
}


class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        for(int num:nums){
            if(!hashSet.add(num)){
                return true;
            }
        }
        return false;
        //return nums.length > hashSet.size();
    }
}
