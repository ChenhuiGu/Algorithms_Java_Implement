package Algorithm4th.Test;

import Algorithm4th.Symbol.BinarySearchTree;

public class SearchTreeTest {
    public static void main(String[] args) {
        BinarySearchTree<Integer,String> tree = new BinarySearchTree<>();
        tree.put(5,"1");
        tree.put(2,"2");
        tree.put(7,"3");
        tree.put(1,"4");
        tree.put(3,"5");
        tree.put(6,"6");
        tree.put(8,"7");
        System.out.println(tree.size());
        System.out.println(tree.get(7));
        System.out.println(tree.min());
        tree.delete(2);
        System.out.println(tree.size());
    }
}
