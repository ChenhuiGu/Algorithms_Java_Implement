package Algorithm4th.Heap;

import Algorithm4th.utils.Common;

public class HeapImpl<T extends Comparable<T>> extends Common implements Heap<T> {
    private T [] items;
    private int N;

    public HeapImpl(T[] items) {
        this.items = items;
        this.N = 0;
    }

    @Override
    public void insert(T t) {
        // 数组从1开始计数
        items[++N] = t;
        swim(N);
    }

    @Override
    public T delMax() {
        T max = items[1];
        exec(items,1,N--);
        //回收
        items[N+1] = null;
        sink(1);
        return max;
    }

    @Override
    public void swim(int k) {
        //while (k>1){
        //    if(less(items,k/2,k)){
        //        exec(items,k,k/2);
        //    }else{
        //        break;
        //    }
        //    k = k/2;
        //}
        //简洁版
        while (k>1 && less(items,k/2,k)){
            exec(items,k,k/2);
            k = k/2;
        }
    }

    @Override
    public void sink(int k) {
        while (2*k<=N){
            //最大值索引
            int max = 2*k;
            //比较兄弟节点,max<N限定边界
            if(max<N &&less(items,max,max+1)) max++;
            //比较父子节点
            if(less(items,max,k)) break;
            exec(items,max,k);
            k = max;
        }
    }
}
