package Algorithm4th.Test;
import Algorithm4th.Sort.ResizingArrayStack;

public class ArrayStackTest {
    public static void main(String[] args){
//        Stack<String> s = new Stack<String>();
//        Queue<String> q = new Queue<String>();
        ResizingArrayStack<String> r = new ResizingArrayStack<>();
        String str = "to be or not to - be - - that - - - is";
        String[] words = str.split(" ");
        for (String item:words
        ) {
            if(!item.equals("-"))
                r.push(item);
            else if (!r.isEmpty()) System.out.print(r.pop() + " ");
        }

    }

}
