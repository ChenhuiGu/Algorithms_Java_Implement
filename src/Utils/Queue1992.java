package Utils;
import java.util.Iterator;

public class Queue1992<Item> implements Iterable<Item> {
    private Node first;
    private Node last;
    private int N;
    private class Node{
        Node next;
        Item item;
        Node(Item item,Node next){
            this.item = item;
            this.next = next;
        }
    }
    public boolean isEmpty(){return first==null;}
    public int Size(){return N;}
    public void enqueue(Item item){
        Node old_last = last;
        last = new Node(item,null);
        if(isEmpty()) first=last;
        else old_last.next = last;
        N++;
    }
    public Item dequeue() {
        Item item = first.item;
        first = first.next;
        if(isEmpty()) last=null;
        N--;
        return item;
    }
    public Iterator<Item> iterator(){
        return  new StackLinkListIterator();
    }
    private class StackLinkListIterator implements Iterator<Item>{
        private Node current = first;
        @Override
        public boolean hasNext() {
            return current !=null;
        }

        @Override
        public Item next() {
//            if(first.next==null) return first.item;
//            else return first.next.item;
            Item item = current.item;
            current = current.next;
            return item;

        }

        @Override
        public void remove() {

        }
    }
}
