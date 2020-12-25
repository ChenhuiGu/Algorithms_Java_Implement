package Algorithm4th.Test;

import Algorithm4th.Heap.MinPriorityQueue;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinPriorityQueueTest {

    @Test
    public void insert() {
        MinPriorityQueue<Integer> pq = new MinPriorityQueue<>(6);
        pq.insert(5);
        pq.insert(3);
        pq.insert(9);
        pq.insert(2);
        System.out.println(pq.delMin());
        System.out.println(pq.size());
        System.out.println(pq.delMin());
    }
}