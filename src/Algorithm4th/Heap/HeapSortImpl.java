package Algorithm4th.Heap;

import Algorithm4th.utils.Common;

import java.lang.reflect.Array;

public class HeapSortImpl<T extends Comparable<T>> extends Common implements HeapSort<T>{
    /**
     * 对source数组排序
     *
     * @param source
     */
    @Override
    public void sort(T[] source) {
        //TODO 泛型无法创建数组
        //java.base/[Ljava.lang.Object; cannot be cast to java.base/[Ljava.lang.Comparable;
        //T[] heap = (T[]) new Object[source.length + 1];
        T[] heap = (T[]) Array.newInstance(source.getClass().getComponentType(),source.length+1);
        createHeap(source,heap);
        for (int i = (heap.length-1); i >1 ; i--) {
            exec(heap,1,i);
            sink(heap,1,i-1);
        }
        System.arraycopy(heap,1,source,0,source.length);
    }

    /**
     * 利用source创建大顶堆heap
     *
     * @param source
     * @param heap
     */
    @Override
    public void createHeap(T[] source, T[] heap) {
        //heap 从1开始  source 从0开始
        System.arraycopy(source,0,heap,1,source.length);
        for (int i = (heap.length/2); i >0 ; i--) {
            sink(heap,i,heap.length-1);
        }
    }

    /**
     * 下沉算法
     *
     * @param heap
     * @param target :起点
     * @param range  :终点
     */
    @Override
    public void sink(T[] heap, int target, int range) {
        while (target*2<=range){
            int max = target*2;
            if(max<range && less(heap,max,max+1)) max++;
            if(less(heap,max,target)) break;
            exec(heap,target,max);
            target = max;
        }
    }
}
