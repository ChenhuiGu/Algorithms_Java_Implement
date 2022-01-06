package cn.guchh.array;

/**
 * @author chenhuigu
 */
public class SearchMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length,n = matrix[0].length;
        int row = 0,col = n-1;
        while(row<m && col>=0){
            if(target == matrix[row][col]) {
                return true;
            }else if(target > matrix[row][col]){
                row++;
            }else {
                col--;
            }
        }
        return false;
    }
}
