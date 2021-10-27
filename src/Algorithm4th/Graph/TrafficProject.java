package Algorithm4th.Graph;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class TrafficProject {
    public static void main(String[] args) throws IOException {
        // 读取文件
        BufferedReader reader = new BufferedReader(new FileReader
                ("/Volumes/GoogleDrive/其他计算机/我的 MacBook Pro/google driver/Java_Project/Algorithms_Java_Implement/data/traffic_project.txt"));
        int number = Integer.parseInt(reader.readLine());
        System.out.println(number);
        int RoadNumber = Integer.parseInt(reader.readLine());
        System.out.println(RoadNumber);
        //构造无向图
        Graph G = new Graph(number);
        for(int i=0;i<RoadNumber;i++){
            String[] s = reader.readLine().split(" ");
            int v = Integer.parseInt(s[0]);
            int w = Integer.parseInt(s[1]);
            G.addEdge(v,w);
        }
        //DFS
        DepthFirstSearch dfs = new DepthFirstSearch(G,9);
        boolean flag1 = dfs.marked(10);
        boolean flag2 = dfs.marked(8);
        System.out.println("9号城市和10号城市是否已相通：" + flag1);
        System.out.println("9号城市和8号城市是否已相通：" + flag2);

    }


}
