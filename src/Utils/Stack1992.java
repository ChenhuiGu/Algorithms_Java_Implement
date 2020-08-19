package Utils;

import java.util.Iterator;

public class Stack1992<Item> implements Iterable<Item>{
    private Node first;
    private int N;
    private class Node{
        Node next;
        Item item;
        Node(Item item, Node next){
            this.item = item;
            this.next = next;
        }
    }
    public boolean isEmpty(){return first==null;}
    public int Size(){return N;}
    public void push(Item item){
        Node old = first;
        first = new Node(item,old);
        N++;
    }
    public Item pop() {
        Item item = first.item;
        first = first.next;
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
