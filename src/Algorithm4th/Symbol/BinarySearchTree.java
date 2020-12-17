package Algorithm4th.Symbol;

public class BinarySearchTree<Key extends Comparable<Key>,Value> {
    //根节点
    private Node root;
    //创造一个树节点
    private class Node{
        private Key key;
        private Value value;
        //左右子树
        private Node left,right;
        //节点数
        private int N;
        public Node(Key key,Value value,int N){
            this.key = key;this.value = value;this.N = N;
        }
    }

    /**
     * 树节点数
     * @return
     */
    public int size(){
        return size(root);
    }
    private int size(Node x){
        if(x==null) return 0;
        else return x.N;
    }

    /**
     * 最小的键
     * @return
     */
    public Key min(){
        return min(root).key;
    }
    private Node min(Node x){
        //if(x == null) return null;
        if(x.left == null) return x;
        return min(x.left);
    }

    /**
     * 添加节点
     * @param key
     * @param value
     */
    public void put(Key key,Value value){
        root = put(root,key,value);
    }
    private Node put(Node x,Key key,Value value){
       Node node = new Node(key,value,1);
       if(x == null){
           return node;
       }
       int cmp = key.compareTo(x.key);
       if(cmp<0){
           x.left = put(x.left,key,value);
       }else if(cmp>0){
           x.right = put(x.right,key,value);
       }else {
           x.value = value;
       }
       x.N = size(x.left) + size(x.right) + 1;
       return x;
    }

    /**
     * 获取Key对应的Value
     * @param key
     * @return
     */
    public Value get(Key key){
        return get(root,key);
    }
    private Value get(Node x,Key key){
        if(x == null) return null;
        int cmp = key.compareTo(x.key);
        if(cmp<0){
            return get(x.left,key);
        }else if(cmp>0){
            return get(x.right,key);
        }else {
            return x.value;
        }
    }

    /**
     * 删除最小的Key，最左下角的叶节点
     */
    public void deleteMin(){
        root = deleteMin(root);
    }
    private Node deleteMin(Node x){
        if(x.left == null) return x.right;
        x.left = deleteMin(x.left);
        x.N = size(x.left) + size(x.right) + 1;
        return x;
    }

    /**
     * 删除特定的节点
     * @param key
     */
    public void delete(Key key){
        root = delete(root,key);
    }
    private Node delete(Node x,Key key){
        if(x == null) return null;
        int cmp = key.compareTo(x.key);
        if(cmp<0){
            x.left = delete(x.left,key);
        }else if(cmp>0){
            x.right = delete(x.right,key);
        }else {
            // 删除节点
            // 左子树为空
            if(x.left == null) return x.right;
            // 右子树为空
            if(x.right == null) return x.left;
            Node t = x;
            x = min(x.right);
            //保证顺序，否则左子树会加到右子树上
            x.right = deleteMin(t.right);
            x.left = t.left;
        }
        x.N = size(x.left) + size(x.right) + 1;
        return x;
    }
}
