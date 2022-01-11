package Algorithm4th.Test;

import Algorithm4th.Heap.Heap;
import Algorithm4th.Heap.HeapImpl;

public class heapTest {
    public static void main(String[] args) {
        Integer[] items = new Integer[8];
        Heap<Integer> heap = new HeapImpl<>(items);
        Integer[] example = new Integer[]{1,4,3,6,5,3,9};
        for (Integer integer : example) {
            heap.insert(integer);
        }
        System.out.println(heap.delMax());
    }
}
