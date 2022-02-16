package Graph;

/**
 * 带权重的边
 */
public class Edge implements Comparable<Edge>{
    private final int v;
    private final int w;
    private final double weight;

    public Edge(int v, int w, double weight) {
        this.v = v;
        this.w = w;
        this.weight = weight;
    }
    public double weight(){
        return weight;
    }

    /**
     * 显示其中一个顶点
     * @return
     */
    public int either(){
        return v;
    }
    public int other(int vertex){
        if(vertex == v){
            return w;
        }else{
            return v;
        }
    }
    @Override
    public int compareTo(Edge that) {
        return Double.compare(this.weight, that.weight);
    }
}
