package BinaryTree;

import java.util.Queue;

public interface SearchTree<Key extends Comparable<Key>, Value> {
    int size();

    Key min();

    void put(Key key, Value value);

    Value get(Key key);

    void deleteMin();

    void delete(Key key);

    Queue<Key> preErgodic();

    Queue<Key> midErgodic();

    Queue<Key> layerErgodic();

    int maxDepth();
}
