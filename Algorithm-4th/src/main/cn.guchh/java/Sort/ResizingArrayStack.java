package Sort;
import java.util.Iterator;

/**
 * 数组实现栈
 * 可迭代
 * @param <Item>
 */
public class ResizingArrayStack<Item> implements Iterable<Item>{
    private Item[] a = (Item[]) new Object[1];
    private int N = 0;
    public boolean isEmpty(){return N==0;}
    public int Size(){return N;}
    public void resize(int max){
        //复制数组，扩容2倍
        Item[] tmp = (Item[]) new Object[max];
        for (int i=0;i<N;i++) {
            tmp[i] = a[i];
        }
        a = tmp;
        System.out.println("The list size" + max);
    }
    public void push(Item item){
        if(N==a.length) resize(2*a.length);
        a[N++] = item;
    }
    public Item pop(){
        Item item = a[--N];
        a[N] = null;
        if(N>0&&N<a.length/4) resize(a.length/2);
        return item;
    }
    @Override
    public Iterator<Item> iterator() {
        return new ReverseArrayIterator();
    }
    public class ReverseArrayIterator implements Iterator<Item>{
        @Override
        public boolean hasNext() {
            return N>0;
        }
        @Override
        public Item next() {
            return a[--N];
        }
    }

}







