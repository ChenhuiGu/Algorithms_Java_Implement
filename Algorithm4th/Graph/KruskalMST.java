package Algorithm4th.Graph;
import Algorithm4th.utils.MinPQ;
import Algorithm4th.utils.WeightedQuickUnionUF;

import java.util.LinkedList;

public class KruskalMST {
    private LinkedList<Edge> mst;
    private WeightedQuickUnionUF uf;
    // 最小优先队列
    private MinPQ<Edge> pq;
    public KruskalMST(EdgeWeightedGraph G){
        mst = new LinkedList<>();
        pq = new MinPQ<>(G.V());
        uf = new WeightedQuickUnionUF(G.V());
        for (Edge edge : G.Edges()) {
            pq.insert(edge);
        }
        while(!pq.isEmpty()){
            Edge e = pq.delMin();
            int v = e.either();
            int w = e.other(v);
            if(uf.connected(w,v)) continue;
            uf.union(v,w);
            mst.offer(e);
        }

    }
    public LinkedList<Edge> edges(){
        return mst;
    }
}
