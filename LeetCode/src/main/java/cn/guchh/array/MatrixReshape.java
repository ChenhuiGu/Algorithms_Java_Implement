package cn.guchh.array;

/**
 * @author chenhuigu
 */
public class MatrixReshape {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length,n = mat[0].length;
        if(m*n != r*c){
            return mat;
        }
        int[][] newMat = new int[r][c];
        for (int i = 0; i < m*n; i++) {
            newMat[i/c][i%c] = mat[i/n][i%n];
        }
        return newMat;
        //// 2d to 1d
        //for (int i = 0; i < mat.length; i++) {
        //    for (int j = 0; j < mat[0].length; j++) {
        //        array[mat[0].length*i+j] = mat[i][j];
        //    }
        //}
        //// 1d to 2d
        //for (int i = 0; i < array.length; i++) {
        //    newMat[i/n][i%n] = array[i];
        //}
        //return newMat;
    }
}
