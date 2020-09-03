package Algorithm4th.Sort;
import Utils.StdRandom;
import java.util.Arrays;
import static Algorithm4th.Sort.Sorted.exec;
import static Algorithm4th.Sort.Sorted.less;

public class Quick {
    public void sort(Comparable[] a){
        //乱序，随机交换元素，消除对输入的依赖
        StdRandom.shuffle(a);
        sort(a,0,a.length-1);
    }
    public void sort(Comparable[] a,int lo,int hi){
        //小数组采用插入排序
        if(lo>=hi) return;
//        int M = 6;
//        if(hi<=lo+M){
//            Insert I = new Insert();
//            I.insert(Arrays.copyOfRange(a,lo,hi));
//            return;
//        }
        int i = partition(a,lo,hi);
        //递归
        sort(a,lo,i-1);
        sort(a,i+1,hi);
    }
    public int partition(Comparable[] a,int lo,int hi){
        int i=lo,j=hi+1;
        Comparable v = a[lo];
        while(true){
            while(less(a[++i],v)){
                //小于v
                if(i==hi) break;
            }
            while(less(v,a[--j])){
                if(j==lo) break;
            }
            if(i>=j) break;
            exec(a,i,j);
        }
        exec(a,lo,j);
        return j;
    }
}
