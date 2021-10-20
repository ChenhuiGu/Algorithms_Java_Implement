package Algorithm4th.Test;

import Algorithm4th.Heap.HeapSort;
import Algorithm4th.Heap.HeapSortImpl;

public class HeapSortTest {
    public static void main(String[] args) {
        Integer[] arr = new Integer[] {3,1,6,9,4,7,3,8};
        HeapSort<Integer> heapSort = new HeapSortImpl<>();
        heapSort.sort(arr);
        for (Integer integer : arr) {
            System.out.println(integer);
        }
    }
}
