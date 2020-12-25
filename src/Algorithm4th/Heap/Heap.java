package Algorithm4th.Heap;

public interface Heap<T extends Comparable<T>> {
    /**
     * 向堆内插入元素
     * @param t
     */
    void insert(T t);

    /**
     * 删除最大元素
     * @return
     */
    T delMax();

    /**
     * 上浮算法
     * @param k
     */
    void swim(int k);

    /**
     * 下沉算法
     * @param k
     */
    void sink(int k);


    
}
