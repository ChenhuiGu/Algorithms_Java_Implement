package BinaryTree;
import Utils.IOApi;
import Utils.Queue1992;


public class
SequentialSearch<Key, Value> {
    private Node first;
    private int N;
    //无序链表
    private class Node {
        Key key;
        Value value;
        Node next;

        public Node(Key key, Value value, Node next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }
    public int Size(){return N;}
    public boolean isEmpty(){return Size()==0;}
    public boolean Contain(Key key){return get(key) != null;}
    public void put(Key key, Value value) {
        for (Node i = first; i != null; i = i.next) {
            if (key.equals(i.key)) {
                i.value = value;
                return;
            }
            first = new Node(key, value, first);//未命中开头添加节点
            N++;
        }
    }
    public Value get(Key key) {
        for (Node x = first; x != null; x = x.next)
            if (key.equals(x.key)) {
                return x.value;
        }
        return null;//未命中
    }
    //delete
    //iterable keys
    public Iterable<Key> keys(){
        //abstract class not instance
//        Queue<Key> queue = new Queue<Key>();
        Queue1992<Key> queue = new Queue1992<Key>();
        return null;
    }

    public static void main(String[] args) {
        IOApi res = new IOApi("tinyTale.txt");
        SequentialSearch<String,Integer> ss = new SequentialSearch<String,Integer>();
        try{
            while (true){
                String[] word_list = res.ReadFromFile();
                for (String word : word_list) {
                    Integer value = ss.get(word);
                    if(value == null) ss.put(word,1);
                    else ss.put(word,value+1);
                }
            }

        }catch (NullPointerException e){
//            e.printStackTrace();
        }
        String max = "";
        ss.put(max,0);
        


    }
}
