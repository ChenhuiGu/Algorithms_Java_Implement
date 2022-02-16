package Graph;

import java.util.LinkedList;

/**
 * 加权有向图
 */
public class EdgeWeightedDigraph {
    private final int V;
    private int E;
    private LinkedList<DirectedEdge>[] adj;

    public EdgeWeightedDigraph(int V) {
        this.V = V;
        E = 0;
        adj = (LinkedList<DirectedEdge>[]) new LinkedList[V];
        for (int i = 0; i < V; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    public int V() {
        return V;
    }

    public int E() {
        return E;
    }

    public void addEdge(DirectedEdge edge) {
        int v = edge.from();
        adj[v].offer(edge);
        E++;
    }

    /**
     * 返回与顶点v关联的所有边
     *
     * @param v
     * @return
     */
    public LinkedList<DirectedEdge> adj(int v) {
        return adj[v];
    }

    /**
     * 返回图的所有边
     *
     * @return
     */
    public LinkedList<DirectedEdge> Edges() {
        LinkedList<DirectedEdge> allEdge = new LinkedList<>();
        for (int v = 0; v < V; v++) {
            for (DirectedEdge edge : adj[v]) {
                allEdge.offer(edge);

            }
        }
        return allEdge;
    }
}
