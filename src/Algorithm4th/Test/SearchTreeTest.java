package Algorithm4th.Test;
import Algorithm4th.Symbol.BinarySearchTree;
import Algorithm4th.Symbol.SearchTree;
import org.junit.Test;
import java.util.Queue;

public class SearchTreeTest {

    @Test
    public void midErgodic(){
        SearchTree tree = createTree();
        Queue<Integer> integers = tree.midErgodic();
        for (Integer integer : integers) {
            System.out.println(integer);
        }
    }

    @Test
    public void layerErgodic(){
        BinarySearchTree tree = createTree();
        Queue<Integer> integers = tree.layerErgodic();
        for (Integer integer : integers) {
            System.out.println(integer);
        }
    }
    @Test
    public void maxDepthTest(){
        BinarySearchTree tree = createTree();
        int i = tree.maxDepth();
        System.out.println(i);
    }

    private BinarySearchTree createTree() {
        BinarySearchTree<Integer,String> tree = new BinarySearchTree<>();
        tree.put(5,"1");
        tree.put(2,"2");
        tree.put(7,"3");
        tree.put(1,"4");
        tree.put(3,"5");
        tree.put(6,"6");
        tree.put(8,"7");
        return tree;
    }
}
