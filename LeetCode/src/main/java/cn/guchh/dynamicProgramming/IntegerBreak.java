package cn.guchh.dynamicProgramming;

/**
 * @author chenhuigu
 */
public class IntegerBreak {
    public int integerBreak(int n) {
        //魔法值，不明含义的数值
        if(n<4){
            return n-1;
        }
        int x = n/3,y = n%3;
        if(y == 0){
            return  (int) Math.pow(3,x);
        }else if(y == 1){
            return (int) Math.pow(3,x-1)*4;
        }else {
            return (int) Math.pow(3,x)*2;
        }
    }
}
