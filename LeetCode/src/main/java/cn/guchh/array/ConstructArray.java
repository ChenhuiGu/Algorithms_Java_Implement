package cn.guchh.array;

/**
 * 数学问题，规律
 * @author chenhuigu
 */
public class ConstructArray {

    public int[] constructArray(int n, int k) {
        int[] ans = new int[n];
        int left = 1,right = k+1;
        for (int i = 0; i < k+1; i++) {
            if(i%2 == 0){
                ans[i] = left;
                left++;
            }else {
                ans[i] = right;
                right--;
            }

        }
        for (int i = k+1; i <n ; i++) {
            ans[i] = i + 1;
        }
        return ans;
    }
}
