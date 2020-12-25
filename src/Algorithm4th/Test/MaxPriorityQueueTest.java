package Algorithm4th.Test;

import Algorithm4th.Heap.MaxPriorityQueue;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxPriorityQueueTest {

    @Test
    public void insert() {
        MaxPriorityQueue<Integer> maxPriorityQueue = new MaxPriorityQueue<>(7);
        maxPriorityQueue.insert(5);
        maxPriorityQueue.insert(3);
        maxPriorityQueue.insert(9);
        maxPriorityQueue.insert(2);
        System.out.println(maxPriorityQueue.max());
        System.out.println(maxPriorityQueue.size());
    }

    @Test
    public void max() {
    }

    @Test
    public void delMax() {
    }

    @Test
    public void isEmpty() {
    }

    @Test
    public void size() {
    }
}