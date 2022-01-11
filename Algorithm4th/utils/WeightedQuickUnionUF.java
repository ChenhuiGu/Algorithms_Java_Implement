package Algorithm4th.utils;

public class WeightedQuickUnionUF {
    private int[] id;//储存分量的根节点
    private int count;
    private int[] sz;//联通分量的数量，保持树的平衡
    public WeightedQuickUnionUF(int N){
        id = new int[N];
        sz = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
            sz[i] = 1;
        }
        count = N;
    }

    public int count(){
        return count;
    }

    public boolean connected(int p,int q){
        return find(p) == find(q);
    }

    /**
     * 返回分量标识符
     * @param p
     * @return
     */
    public int find(int p){
        // 跟随链接找到根节点
        while(id[p] != p) p = id[p];
        return p;
    }

    public void union(int p,int q){
        // 根节点
        int i = find(p);
        int j = find(q);
        if(i == j) return;
        if(sz[i] > sz[j]){
            id[j] = i;
            sz[i] += sz[j];
        }else{
            id[i] = j;
            sz[j] += sz[i];
        }
        count--;

    }
}
