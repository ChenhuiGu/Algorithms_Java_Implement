package Sort;

/**
 * @author chenhuigu
 */
public class BaseSort {
    public boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    public void exec(Object[] a, int i, int j) {
        Object tmp = a[j];
        a[j] = a[i];
        a[i] = tmp;
    }
    public void execBit(int[] a,int i,int j){
        a[i] = a[i]^a[j];
        a[j] = a[j]^a[i];
        a[i] = a[i]^a[j];
    }

}
