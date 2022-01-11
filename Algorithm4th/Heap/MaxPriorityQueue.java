package Algorithm4th.Heap;

public class MaxPriorityQueue<Key extends Comparable<Key>> {
    private Key[] pq;
    private int N=0;
    public MaxPriorityQueue(int max){
        pq = (Key[]) new Comparable[max+1];
    }
    public void insert(Key v){
        //自增、赋值
        pq[++N] = v;
        swim(N);
    }
    public Key max(){
        return pq[1];
    }
    public Key delMax(){
        Key max = max();
        exec(1,N--);
        pq[N+1] = null;
        sink(1);
        return max;
    }
    public boolean isEmpty(){
        return N == 0;
    }
    public int size(){
        return N;
    }
    private boolean less(int i,int j){
        return pq[i].compareTo(pq[j]) < 0;
    }
    private void exec(int i,int j){
        Key tmp = pq[i];
        pq[i] = pq[j];
        pq[j] = tmp;
    }
    private void swim(int k){
        //与父元素相比，大于则交换
        while(k>1 && less(k/2,k)){
            exec(k/2,k);
            k = k/2;
        }
    }
    private void sink(int k){
        while (2*k<=N){
            int j = 2*k;
            //与子节点中较大者交换
            if(j<N && less(j,j+1)) j++;
            if(!less(k,j)) break;
            exec(k,j);
            k = j;
        }
    }
}
