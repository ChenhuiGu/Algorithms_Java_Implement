package Utils;

public class Math_Self {
    public static double sqrt(double c){
        //牛顿迭代法
        if(c<0) return Double.NaN;
        double err = 1e-15;
        double t = c;
        while (java.lang.Math.abs(t-c/t)>err*t){
            t = (c/t + t)/2.0;
        }
        return t;
    }
}
