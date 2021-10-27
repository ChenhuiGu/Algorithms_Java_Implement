package Algorithm4th.Test;
import Algorithm4th.Graph.Edge;
import Algorithm4th.Graph.EdgeWeightedGraph;
import Algorithm4th.Graph.KruskalMST;
import Algorithm4th.Graph.PrimMST;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class MstTets {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new FileReader("/Volumes/GoogleDrive/其他计算机/我的 MacBook Pro/google driver/Java_Project/Algorithms_Java_Implement/data/tinyEWG.txt"));
        //顶点数
        int V = Integer.parseInt(reader.readLine());
        //边数
        int E = Integer.parseInt(reader.readLine());
        // 加权无向图
        EdgeWeightedGraph G = new EdgeWeightedGraph(V);
        for (int i = 0; i < E; i++) {
            String[] line = reader.readLine().split(" ");
            int v = Integer.parseInt(line[0]);
            int w = Integer.parseInt(line[1]);
            double weight = Double.parseDouble(line[2]);
            G.addEdge(new Edge(v,w,weight));
        }
        //PrimMST primMST = new PrimMST(G);
        //Edge[] edges = primMST.edges();
        //for (int i = 0; i < edges.length; i++) {
        //    Edge edge = edges[i];
        //    if (edge !=null){
        //        System.out.println(edge.either() + "-" + edge.other(edge.either()) + "::" +
        //                edge.weight());
        //    }
        //}

        KruskalMST kruskalMST = new KruskalMST(G);
        LinkedList<Edge> edges = kruskalMST.edges();
        for (Edge edge : edges) {
            if (edge != null) {
                System.out.println(edge.either() + "-" + edge.other(edge.either()) + "::" +
                        edge.weight());
            }
        }
    }
}
