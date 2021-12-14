package Algorithm4th.stackAndQueue;

import java.util.Deque;
import java.util.LinkedList;

/**
 *
 */

public class IsValid {
    public boolean isValid(String s) {
        //长度为奇数直接返回
        if(s.length()%2==1) return false;
        Deque<Character> stack = new LinkedList<>();
        for(char c:s.toCharArray()){
            if(c=='(') stack.push(')');
            else if(c=='{') stack.push('}');
            else if(c=='[') stack.push(']');
            else if(stack.isEmpty()||c!=stack.pop()) return false;
        }
        return stack.isEmpty();
    }
}
