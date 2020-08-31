package Algorithm4th.Sort;

public class Sorted {
    //临时数组
    private static Comparable [] aux;
    public static void main(String[] args) {
//        Integer[] arr = {12,4,33,15,7};
//        select(arr);
//        insert(arr)；
//        shell(arr);
        Integer[] arr = {4,7,12,15,3,8,10};
        merge(arr,0,3,6);
        show(arr);
    }
    public static boolean less(Comparable v, Comparable w){
        return v.compareTo(w) < 0;
    }
    public static void exec(Comparable[] a,int i,int j){
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
    private static void show(Comparable[] a){
        for (Comparable i:a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void select(Comparable[] a){
        int N = a.length;
        for(int i=0;i<N;i++){
            int min = i;
            for(int j=i+1;j<N;j++){
                if(less(a[j],a[min])) min = j;
            }
            System.out.print(min);
            exec(a,i,min);
        }
    }
    public static void insert(Comparable[] a){
        int N = a.length;
        for(int i=1;i<N;i++){
            for(int j=i;j>0&&less(a[j],a[j-1]);j--){
                exec(a,j,j-1);
                show(a);
            }
        }
    }
    public static void shell(Comparable[] a){
        int N =a.length;
        int h = 1;
        while(h<N/3) h = h*3 + 1;
        while(h>=1){
            for(int i=h;i<N;i++){
                for(int j=i;j>0&&less(a[j],a[j-h]);j-=h){
                    exec(a,j,j-h);
                }
            }
            h = h/3;
        }
    }
    public static void merge(Comparable[] a,int lo,int mid,int hi){
        //合并a[lo,mid]和a[mid,hi],原地归并
        int i = lo;
        int j = mid + 1;
        //数组初始化，确定长度
        aux = new Comparable[a.length];
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
}
