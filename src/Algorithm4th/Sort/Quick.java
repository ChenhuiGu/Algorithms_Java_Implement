package Algorithm4th.Sort;

import Utils.StdRandom;

import java.util.Random;

import static Algorithm4th.Sort.Sorted.exec;
import static Algorithm4th.Sort.Sorted.less;

public class Quick {
    public static void sort(Comparable[] a){
        //乱序，随机交换元素
        StdRandom.shuffle(a);
        sort(a,0,a.length-1);
    }
    public static void sort(Comparable[] a,int lo,int hi){
        //方法重载
        if(lo>=hi) return;
        int i = partition(a,lo,hi);
        //递归
        sort(a,lo,i);
        sort(a,i,hi);
    }
    public static int partition(Comparable[] a,int lo,int hi){
        int i=lo,j=hi;
        Comparable v = a[lo];
        while(true){
            while(less(a[i++],v)){
                //小于v
                if(i>hi) break;
            }
            while(less(v,a[j++])){
                if(j<lo) break;
            }
            if(i>=j) break;
            exec(a,i,j);
        }
        exec(a,lo,j);
        return j;
    }
}
