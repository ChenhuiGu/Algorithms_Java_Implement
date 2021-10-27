package Algorithm4th.Graph;

import Algorithm4th.utils.IndexMinPQ;

import java.util.LinkedList;

public class DijkstraSP {
    private DirectedEdge[] edgeTo;
    private double[] distTo;
    private IndexMinPQ<Double> pq;
    public DijkstraSP(EdgeWeightedDigraph G,int s){
        edgeTo = new DirectedEdge[G.V()];
        distTo = new double[G.V()];
        for (int i = 0; i < G.V(); i++) {
            distTo[i] = Double.POSITIVE_INFINITY;
        }
        pq = new IndexMinPQ<>(G.V());
        distTo[s] = 0.0;
        pq.insert(s,0.0);
        while (!pq.isEmpty()){
            relax(G, pq.delMin());
        }
    }
    //放松顶点
    private void relax(EdgeWeightedDigraph G,int v){
        for (DirectedEdge edge : G.adj(v)) {
            int w = edge.to();
            //从v到w
            double tmp = distTo[v] + edge.weight();
            if(distTo[w] > tmp){
                distTo[w] = tmp;
                edgeTo[w] = edge;
                if(pq.contains(w)){
                    pq.changeKey(w,tmp);
                }else{
                    pq.insert(w,tmp);
                }
            }
        }
    }
    //最短路径权重和
    public double distTo(int v){
        return distTo[v];
    }
    public boolean hasPathTo(int v){
        return distTo[v] < Double.POSITIVE_INFINITY;
    }
    public LinkedList<DirectedEdge> pathTo(int v){
        //是否可达
        if(!hasPathTo(v)){
            return null;
        }
        LinkedList<DirectedEdge> allEdge = new LinkedList<>();
        while(true){
            DirectedEdge lastEdge = edgeTo[v];
            if(lastEdge == null) break;
            allEdge.offer(lastEdge);
            v = lastEdge.from();
        }
        return allEdge;
    }
}
