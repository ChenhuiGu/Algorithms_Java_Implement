package cn.guchh.stackAndQueue;

import java.util.Deque;
import java.util.LinkedList;

public class MinStack {
    int min;
    Deque<Integer> stack;
    public MinStack() {
        min = Integer.MAX_VALUE;
        stack = new LinkedList<>();
    }

    public void push(int val) {
        if(val < min) min = val;
        stack.push(val);
    }

    public void pop() {
        int val = stack.pop();
        if(val == min) {
            int tmp = Integer.MAX_VALUE;
            for (Integer integer : stack) {
                if(tmp > integer){
                    tmp = integer;
                }
            }
            min = tmp;
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min;
    }
}
