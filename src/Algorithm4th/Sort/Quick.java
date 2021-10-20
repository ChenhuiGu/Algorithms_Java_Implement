package Algorithm4th.Sort;
import Algorithm4th.utils.Common;
import Utils.StdRandom;


public class Quick extends Common {
    public void sort(Comparable[] a){
        //乱序，随机交换元素，消除对输入的依赖
        StdRandom.shuffle(a);
        sort(a,0,a.length-1);
    }
    public void sort(Comparable[] a,int lo,int hi){
        //小数组采用插入排序
//        int M = 6;
//        if(hi<=lo+M){
//            Insert I = new Insert();
//            I.insert(Arrays.copyOfRange(a,lo,hi));
//            return;
//        }
        if(lo>=hi) return;
        int i = partition(a,lo,hi);
        //递归
        sort(a,lo,i-1);
        sort(a,i+1,hi);
    }
    public int partition(Comparable[] a,int lo,int hi){
        int i=lo,j=hi+1;
        while(true){
            while(less(a,++i,lo)){
                //小于v
                if(i==hi) break;
            }
            while(less(a,lo,--j)){
                if(j==lo) break;
            }
            if(i>=j) break;
            exec(a,i,j);
        }
        exec(a,lo,j);
        return j;
    }
    public void quick3way(Comparable[] a,int lo,int hi){
        if(lo>=hi) return;
        int lt = lo,i = lo+1,gt=hi;
        Comparable v = a[lo];
        while(i<=gt){
            int cmp = v.compareTo(a[i]);
            if(cmp>0){
                //小于切分元素
                exec(a,i++,lt++);
            }
            if(cmp<0){
                exec(a,i,gt--);
            }
            else i++;
        }
        quick3way(a,lo,lt-1);
        quick3way(a,gt+1,hi);
    }
}
