package Algorithm4th.Sort;
import java.util.Iterator;
/**
 * 链表和泛型实现List
 *  可迭代
 */


public class SingleLinkList<T> implements Iterable<T>{
    Node<T> head;
    public void add(T data){
        Node<T> node = new Node<>(data,null);
        if(head==null){
            head = node;
        }else {
            Node<T> current = head;
            while (current.next != null){
                current = current.getNext();
            }
            current.setNext(node);
        }

    }
    @Override
    public Iterator<T> iterator() {
        return new LinkIterator<T>(this);
    }

    private class LinkIterator<T> implements Iterator<T>{
        Node<T> current;
        public LinkIterator(SingleLinkList<T> list){
            current = list.head;
        }
        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            T data = current.getData();
            current = current.getNext();
            return data;
        }
    }

}

/**
 * 单链表
 * @param <T>
 */
class Node<T>{
    T data;
    Node<T> next;
    public Node(T data,Node<T> next){
        this.data = data;
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}