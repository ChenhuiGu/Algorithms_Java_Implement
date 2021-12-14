package Algorithm4th.Test;

import Algorithm4th.BinaryTree.RedBlackTree;

public class RedBlackTreeTest {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{37, 71, 78, 81, 70, 30, 92, 16, 29};
        RedBlackTree<Integer,String> tree = new RedBlackTree<>();
        for (Integer integer : arr) {
            tree.put(integer,integer.toString());
        }
        System.out.println(tree.size());
        System.out.println(tree.get(16));
    }
}
