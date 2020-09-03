package Algorithm4th.Sort;

public class Merge extends Common{
    private Comparable [] aux;
    public void merge(Comparable[] a,int lo,int mid,int hi){
        //合并a[lo,mid]和a[mid,hi],原地归并
        int i = lo;
        int j = mid + 1;
        for(int k=lo;k<hi+1;k++){
            aux[k] = a[k];//aux储存临时数据
        }
        for(int k=lo;k<hi+1;k++){
            if(i>mid){a[k]=aux[j++];}//左边数组合并完毕
        else if(j>hi){a[k]=aux[i++];}//左边数组合并完毕
            else if(less(aux[j],aux[i])){a[k]=aux[j++];}//左边数组元素小
            else {a[k]=aux[i++];}
        }
    }
    public void sort(Comparable[] a){
        int N = a.length;
        //数组初始化，确定长度
        aux = new Comparable[N];
        sort(a,0,N-1);
    }
    //递归
    private void sort(Comparable[] a,int lo,int hi){
        if(lo>=hi) return;
        // 1/2==0
        int mid = lo + (hi-lo)/2;
        sort(a,lo,mid);
        sort(a,mid+1,hi);
        merge(a,lo,mid,hi);
    }
    public void sortBU(Comparable[] a){
        int N = a.length;
        //数组初始化，确定长度
        aux = new Comparable[N];
        for(int sz=1;sz<N;sz=sz+sz){
            for(int lo=0;lo<N-sz;lo+=sz+sz){
                merge(a,lo,lo+sz-1,Math.min(lo+sz+sz-1,N-1));
            }
        }
    }
}
