package cn.guchh.String;

import com.google.common.base.Joiner;

import java.util.Arrays;
import java.util.List;

/**
 * 字符串循环右移K位
 * - K可能大于N
 * @author chenhuigu
 */
public class RightShift {
    public String rightShift(String str,int k){
        int n = str.length();
        k %= n;
        char[] stringArr = str.toCharArray();
        reverse(stringArr,0,n-k-1);
        reverse(stringArr,n-k,n-1);
        reverse(stringArr,0,n-1);
        return Arrays.toString(stringArr);
        //return Joiner.on("").join(List.of(stringArr));
    }

    private void reverse(char[] arr,int begin,int end){
        for (;begin<end ; begin++,end--) {
            char temp = arr[begin];
            arr[begin] = arr[end];
            arr[end] = temp;
        }
    }
}
