package Algorithm4th.Symbol;

public class BinarySearchTree<Key extends Comparable<Key>,Value> {
    private Node root;
    //创造一个树节点
    private class Node{
        private Key key;
        private Value value;
        private Node left,right;
        private int N;
        public Node(Key key,Value value,int N){
            this.key = key;this.value = value;this.N = N;
        }
    }
//    public Value get(Key key){
//        Value value;
//        return value;
//    }
    public void put(Key key,Value value){
        ;
    }

}
