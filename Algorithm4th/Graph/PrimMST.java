package Algorithm4th.Graph;
import Algorithm4th.utils.IndexMinPQ;

import java.util.LinkedList;

public class PrimMST {
    private Edge[] edgeTo;
    private double[] distTo;
    private boolean[] marked;
    private IndexMinPQ<Double> pq;

    public PrimMST(EdgeWeightedGraph G){
        //索引代表顶点，值表示当前顶点和最小生成树之间的最短边
        edgeTo = new Edge[G.V()];
        //索引代表顶点，值表示当前顶点和最小生成树之间的最短边的权重
        distTo = new double[G.V()];
        marked = new boolean[G.V()];
        //存放树中顶点与非树中顶点之间的有效横切边
        pq = new IndexMinPQ<>(G.V());
        for (int i = 0; i < G.V(); i++) {
            // 无限大
            distTo[i] = Double.POSITIVE_INFINITY;
        }
        //将0加入最小生成树
        distTo[0] = 0;
        pq.insert(0,0.0);
        //将最小的顶点放入树中
        while (!pq.isEmpty()){
            visit(G,pq.delMin());
        }
    }

    /**
     * 将顶点v添加到最小生成树内
     * @param G
     * @param v
     */
    private void visit(EdgeWeightedGraph G,int v){
        marked[v] = true;
        for (Edge edge : G.adj(v)) {
            int w = edge.other(v);
            if(marked[w]) continue;
            if (edge.weight() < distTo[w]){
                edgeTo[w] = edge;
                distTo[w] = edge.weight();
                if(pq.contains(w)){
                    pq.changeKey(w,distTo[w]);
                }else{
                    pq.insert(w,distTo[w]);
                }
            }
        }
    }

    /**
     * 获取最小生成树内的全部边
     * @return
     */
    public Edge[] edges(){
        return edgeTo;
    }



}
