package Algorithm4th.Sort;

public class Sorted {
    public static void main(String[] args) {
        Integer[] arr = {12,4,33,15,7};
//        select(arr);
//        insert(arr);
        shell(arr);
        show(arr);
    }
    private static boolean less(Comparable v, Comparable w){
        return v.compareTo(w) < 0;
    }
    private static void exec(Comparable[] a,int i,int j){
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
}
