package Graph;
import Algorithm4th.Graph.Digraph;
import java.util.LinkedList;


public class TopoLogical {
    private LinkedList<Integer> order;
    public TopoLogical(Digraph G){
        DirectedCycle dc = new DirectedCycle(G);
        if(!dc.hasCycle()){
            DepthFirstOrder dfo =new DepthFirstOrder(G);
            order = dfo.reversePost();
        }
    }
    public boolean isCycle(){
        return order == null;
    }
    public LinkedList<Integer> order(){
        return order;
    }
}

/**
 * 检测有向环
 */
class DirectedCycle{
    private boolean[] marked;
    private boolean hasCycle;
    private boolean[] onStack;

    public DirectedCycle(Digraph G){
        marked = new boolean[G.V()];
        hasCycle = false;
        onStack = new boolean[G.V()];
        for (int v = 0; v < G.V(); v++) {
            if(!marked[v]){
                dfs(G,v);
            }
        }
    }

    private void dfs(Digraph G,int v){
        marked[v] = true;
        onStack[v] = true;
        for (Integer w : G.adj(v)) {
            if(!marked[w]){
                dfs(G,w);
            }
            if(onStack[w]){
                hasCycle = true;
                return;
            }
        }
        onStack[v] = false;
    }
    public boolean hasCycle(){
        return hasCycle;
    }
}

/**
 * 基于深度搜索
 */
class DepthFirstOrder{
    private boolean[] marked;
    private LinkedList<Integer> reversePost;

    public DepthFirstOrder(Digraph G){
        marked = new boolean[G.V()];
        reversePost = new LinkedList<>();
        for (int v = 0; v < G.V(); v++) {
            if(!marked[v]){
                dfs(G,v);
            }
        }
    }

    private void dfs(Digraph G,int v){
        marked[v] = true;
        for (Integer w : G.adj(v)) {
            if(!marked[w]){
                dfs(G,w);
            }
        }
        reversePost.offer(v);
    }

    public LinkedList<Integer> reversePost(){
        return reversePost;
    }
}