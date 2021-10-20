package Algorithm4th.Heap;

/**
 * 泛型，默认public，方便被重写
 * @param <T>
 */
public interface HeapSort<T extends Comparable<T>> {
    /**
     * 对source数组排序
     * @param source
     */
    void sort(T[] source);

    /**
     * 利用source创建大顶堆heap
     * @param source
     * @param heap
     */
    void createHeap(T[] source,T[] heap);

    /**
     * 下沉算法
     * @param heap
     * @param target:起点
     * @param range:终点
     */
    void sink(T[] heap,int target,int range);
}
