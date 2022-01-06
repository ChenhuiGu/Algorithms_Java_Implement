package cn.guchh.array;

/**
 * @author chenhuigu
 */
public class KthSmallest {
    /**
     * 找出二维矩阵中最小的数 left，最大的数 right，那么第 k 小的数必定在 left ~ right 之间
     * mid=(left+right) / 2；在二维矩阵中寻找小于等于 mid 的元素个数count
     * 若这个 count 小于 k，表明第 k 小的数在右半部分且不包含 mid，即 left=mid+1, right=right，又保证了第 kk 小的数在 leftleft ~ rightright 之间
     * 若这个 count 大于 k，表明第 k 小的数在左半部分且可能包含 mid，即 left=left, right=mid，又保证了第 kk 小的数在 left~rightleft right 之间
     * 因为每次循环中都保证了第 k 小的数在 left ~ right 之间，当 left==right时，第 k 小的数即被找出，等于 right
     *
     * @param matrix
     * @param k
     * @return
     */
    public int kthSmallest(int[][] matrix, int k) {
        int row = matrix.length,col = matrix[0].length;
        int left = matrix[0][0],right = matrix[row-1][col-1];
        while (left < right){
            int mid = left + ((right - left)>>1);
            if(check(matrix,mid,k,row)){
                right = mid;
            }else {
                left = mid + 1;
            }
        }
        return left;

    }

    /**
     * 不大于mid的个数是否大于k
     * 从左下角开始搜索，大往右，小往上
     * @param matrix
     * @param mid
     * @param k
     * @param n
     * @return
     */
    public boolean check(int[][] matrix, int mid, int k, int n) {
        int i = n-1,j=0;
        int count = 0;
        while(i>=0&&j<n){
            if(matrix[i][j] <= mid){
                j++;
                count += i+1;
            }else {
                i--;
            }
        }
        return count >=k;
    }
}
