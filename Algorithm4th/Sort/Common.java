package Algorithm4th.Sort;

public class Common {
    protected static boolean less(Comparable v, Comparable w){
        return v.compareTo(w) < 0;
    }
    protected static void exec(Comparable[] a,int i,int j){
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
    protected static void show(Comparable[] a){
        for (Comparable i:a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
