package Graph;

import java.util.LinkedList;

public class BreadFirstSearch {
    private boolean[] marked;
    private int count;
    private LinkedList<Integer> waitSearch;

    public BreadFirstSearch(Graph G, int s) {
        this.marked = new boolean[G.V()];
        this.waitSearch = new LinkedList<Integer>();
        this.count = 1;
        bfs(G,s);
    }

    private void bfs(Graph G,int v){
        marked[v] = true;
        waitSearch.offer(v);
        while (!waitSearch.isEmpty()){
            Integer d = waitSearch.pop();
            for (Integer w : G.adj(d)) {
                if(!marked[w]){
                    waitSearch.offer(w);
                    marked[w] = true;
                    count++;
                }

            }
        }

        //递归为深度优先
        //bfs(G,waitSearch.pop());
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
