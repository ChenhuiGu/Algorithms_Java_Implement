package BinaryTree;

public class RedBlackTree<Key extends Comparable<Key>,Value> {
    private static final boolean RED = true;
    private static final boolean BLACK = false;
    private Node root;
    //节点类
    private class Node{
        Key key;
        Value value;
        Node left,right;
        boolean color;
        //树的节点数和该节点的节点数
        int N;

        public Node(Key key, Value value, Node left, Node right, boolean color, int n) {
            this.key = key;
            this.value = value;
            this.left = left;
            this.right = right;
            this.color = color;
            N = n;
        }
    }
    private boolean isRed(Node x){
        if(x == null) return false;
        return x.color == RED;
    }

    /**
     * 左旋
     * @param h
     * @return
     */
    private Node rotateLeft(Node h){
        Node x = h.right;
        h.right = x.left;
        x.left = h;
        x.color = h.color;
        h.color = RED;
        // 调整
        x.N = h.N;
        h.N = size(h.left) + size(h.right) + 1;
        return x;
    }

    /**
     * 右旋
     * @param h
     * @return
     */
    private Node rotateRight(Node h){
        Node x = h.left;
        h.left = x.right;
        x.right = h;
        x.color = h.color;
        h.color = RED;
        x.N = h.N;
        h.N = size(h.left) + size(h.right) + 1;
        return x;
    }

    /**
     * 颜色变换
     * @param h
     * @return
     */
    private void flipColor(Node h){
        h.right.color = BLACK;
        h.left.color = BLACK;
        h.color = RED;
    }

    /**
     * 插入元素
     * @param key 键
     * @param value 值
     */
    public void put(Key key,Value value){
        root = put(root,key,value);
        // 根节点永远是黑色的
        root.color = BLACK;
    }
    private Node put(Node h,Key key,Value value){
        if(h == null){
            return new Node(key,value,null,null,RED,1);
        }
        int cmp = key.compareTo(h.key);
        //新值小于节点，向左添加
        if(cmp<0) h.left = put(h.left,key,value);
        //向右添加
        else if(cmp>0) h.right = put(h.right,key,value);
        else h.value = value;
        //if(h.right.color == RED && h.left.color == BLACK)

        if(isRed(h.right) && !isRed(h.left)) h = rotateLeft(h);
        if(isRed(h.left) && isRed(h.left.left)) h = rotateRight(h);
        if(isRed(h.left) && isRed(h.right)) flipColor(h);

        h.N = size(h.left) + size(h.right) + 1;
        return h;
    }

    /**
     * 查找键对应的值
     * @param key
     * @return
     */
    public Value get(Key key){
        return get(root, key);
    }
    private Value get(Node x,Key key){
        if(x == null) return null;
        int cmp = key.compareTo(x.key);
        if(cmp<0) return get(x.left,key);
        else if(cmp>0) return get(x.right,key);
        else return x.value;
    }

    /**
     * 树的节点数
     * @return
     */
    public int size(){
        return size(root);
    }
    private int size(Node x){
        if (x == null) return 0;
        return x.N;
    }

}
