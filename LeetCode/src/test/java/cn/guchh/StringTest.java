package cn.guchh;

import cn.guchh.String.RightShift;
import org.junit.Test;

public class StringTest {
    @Test
    public void rightShift(){
        RightShift rightShift = new RightShift();
        String shift = rightShift.rightShift("abcd123", 3);
        System.out.println(shift);
    }

}
