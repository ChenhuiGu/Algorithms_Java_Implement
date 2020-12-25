package Algorithm4th.Test;

import Algorithm4th.Graph.DepthFirstSearch;
import Algorithm4th.Graph.Graph;
import org.junit.Test;

public class GraphTest {
    public Graph creatGraph(){
        Graph graph = new Graph(13);
        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(0,6);
        graph.addEdge(0,5);
        graph.addEdge(3,4);
        graph.addEdge(3,5);
        graph.addEdge(4,5);
        graph.addEdge(4,6);
        graph.addEdge(7,8);
        graph.addEdge(9,10);
        graph.addEdge(9,11);
        graph.addEdge(9,12);
        graph.addEdge(11,12);
        //System.out.println(graph.adj(0));
        //System.out.println(graph.E());
        return graph;
    }
    @Test
    public void dfsTest(){
        Graph graph = creatGraph();
        DepthFirstSearch depthFirstSearch = new DepthFirstSearch(graph,0);
        System.out.println(depthFirstSearch.count());
        System.out.println(depthFirstSearch.marked(3));
    }
}
