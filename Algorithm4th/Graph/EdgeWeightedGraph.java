package Algorithm4th.Graph;
import java.util.LinkedList;

/**
 * 加权无向图
 */
public class EdgeWeightedGraph {
    private final int V;
    private int E;
    private LinkedList<Edge>[] adj;

    public EdgeWeightedGraph(int V) {
        this.V = V;
        E = 0;
        adj = new LinkedList[V];
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

    public void addEdge(Edge e) {
        int v = e.either();
        int w = e.other(v);
        adj[v].offer(e);
        adj[w].offer(e);
        E++;
    }

    /**
     * 返回与顶点v关联的所有边
     *
     * @param v
     * @return
     */
    public LinkedList<Edge> adj(int v) {
        return adj[v];
    }

    /**
     * 返回图的所有边
     * @return
     */
    public LinkedList<Edge> Edges() {
        LinkedList<Edge> allEdge = new LinkedList<>();
        for (int v = 0; v < V; v++) {
            for (Edge edge : adj[v]) {
                if (v < edge.other(v)) {
                    allEdge.offer(edge);
                }
            }
        }
        return allEdge;
    }
}

