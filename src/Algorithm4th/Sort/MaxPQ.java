package Algorithm4th.Sort;
/*
利用有序堆构建优先队列
插入元素
删除最大（最小）元素
 */
public class MaxPQ<Key extends Comparable<Key>> {
    private Key[] pq;
    private int N=0;
    MaxPQ(){}
    MaxPQ(int max){
        pq = (Key[]) new Comparable[max+1];
    }
    MaxPQ(Key[] a){}
    public void insert(Key v){

    }
    public Key max(){

    }
    public Key delMax(){

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
        while(k>1 && less(k/2,k)){
            exec(k/2,k);
            k = k/2;
        }
    }
    private void sink(int k){
        while (2*k<=N){
            int j = 2*k;
            if(j)
        }
    }
}
