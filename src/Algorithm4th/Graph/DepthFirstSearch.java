package Algorithm4th.Graph;

import java.util.LinkedList;

public class DepthFirstSearch {
    private boolean[] marked;
    private int count;

    public DepthFirstSearch(Graph G, int s) {
        // default false
        this.marked = new boolean[G.V()];
        this.count = 0;
        dfs(G,s);
    }

    private void dfs(Graph G,int v){
        marked[v] = true;
        for (Integer w : G.adj(v)) {
            if(!marked[w]){
                dfs(G,w);
            }
        }
        count++;
    }

    /**
     * w与s是否相连
     * @param w
     * @return
     */
    public boolean marked(int w){
        return marked[w];
    }

    /**
     * 与顶点相通的数量,包含自身
     * @return
     */
    public int count(){
        return count;
    }
}
