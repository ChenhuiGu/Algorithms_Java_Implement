package Sort;

import Utils.StdRandom;


public class Quick {
    public void sort(Comparable[] a) {
        //乱序，随机交换元素，消除对输入的依赖
        StdRandom.shuffle(a);
        sort(a, 0, a.length - 1);
    }

    private void sort(Comparable[] a, int lo, int hi) {
        if (lo >= hi) return;
        int j = partition(a, lo, hi);
        sort(a, lo, j - 1);
        sort(a, j + 1, hi);
    }

    private int partition(Comparable[] a, int lo, int hi) {
        int i = lo, j = hi + 1;
        Comparable v = a[lo];
        while(true){
            //从左搜索，遇到大的停止
            while(less(a[++i],v));
            //从右搜索，遇到小的停止
            while(less(v,a[--j]));
            if(i>=j) break;
            exec(a,i,j);
        }
        //将基准元素与右边第一个元素互换
        exec(a,lo,j);
        return j;

    }

    private boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private void exec(Object[] a, int i, int j) {
        Object tmp = a[j];
        a[j] = a[i];
        a[i] = tmp;
    }

}
