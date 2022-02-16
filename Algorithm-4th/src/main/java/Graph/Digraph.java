package Graph;
import java.util.LinkedList;

public class Digraph {
    private final int V;
    private int E;
    private LinkedList<Integer>[] adj;

    public Digraph(int V){
        this.V = V;
        this.E = 0;
        this.adj = (LinkedList<Integer>[]) new LinkedList[V];
        for (int i = 0; i < V; i++) {
            adj[i] = new LinkedList<Integer>();
        }
    }

    public int V(){
        return V;
    }
    public int E(){
        return E;
    }
    public void addEdge(int v,int w){
        adj[v].offer(w);
        E++;
    }
    public LinkedList<Integer> adj(int v){
        return adj[v];
    }

    public Digraph reverse(){
        Digraph dg = new Digraph(V);
        for (int v = 0; v < V; v++) {
            for (Integer w : adj[v]) {
                dg.addEdge(w,v);
            }
        }
        return dg;
    }
}