package cn.guchh.stackAndQueue;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 用栈实现队列
 * pop:清除并返回第一个元素
 * peak:返回第一个元素
 * push:添加到末尾
 */
public class MyQueue {
    Deque<Integer> in;
    Deque<Integer> out;
    public MyQueue() {
        in = new ArrayDeque<>();
        out = new ArrayDeque<>();
    }

    public void push(int x) {
        in.push(x);
    }

    public int pop() {
        if (out.isEmpty()){
            inToOut();
        }
        return out.pop();
    }

    public int peek() {
        if (out.isEmpty()){
            inToOut();
        }
        return out.peek();
    }

    public boolean empty() {
        return in.isEmpty() && out.isEmpty();
    }

    public void inToOut(){
        while (!in.isEmpty()){
            out.push(in.pop());
        }
    }
}
