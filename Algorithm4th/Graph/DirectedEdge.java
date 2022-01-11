package Algorithm4th.Graph;

public class DirectedEdge {
    private final int v;
    private final int w;
    private final double weight;

    public DirectedEdge(int v, int w, double weight) {
        this.v = v;
        this.w = w;
        this.weight = weight;
    }
    //起点
    public int from(){
        return v;
    }
    //终点
    public int to(){
        return w;
    }
    public double weight(){
        return weight;
    }
}
