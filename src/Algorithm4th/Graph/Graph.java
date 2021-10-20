package Algorithm4th.Graph;
import java.util.LinkedList;

public class Graph {
    private final int V;
    private int E;
    // 邻接表,一组由队列构成的数组
    private LinkedList<Integer>[] adj;

    public Graph(int V) {
        this.V = V;
        E = 0;
        adj = (LinkedList<Integer>[]) new LinkedList[V];
        for (int i = 0; i < V; i++) {
            adj[i] = new LinkedList<Integer>();
        }
    }

    /**
     * 图中顶点的数量
     * @return
     */
    public int V(){
        return V;
    }

    /**
     * 图中边的数量
     * @return
     */
    public int E(){
        return E;
    }

    /**
     * 连接顶点v和w
     * @param v
     * @param w
     */
    public void addEdge(int v,int w){
        adj[v].offer(w);
        adj[w].offer(v);
        E++;
    }

    /**
     * 与顶点相邻的点
     * @param v
     * @return
     */
    public LinkedList<Integer> adj(int v){
        return adj[v];
    }
}
