package Algorithm4th.utils;

public class Common<T extends Comparable<T>> {
    protected boolean less(T[] a,int i,int j){
        return a[i].compareTo(a[j]) < 0;
    }
    protected void exec(T[] a,int i,int j){
        T t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
    //protected static void show(T[] a){
    //    for (T i:a) {
    //        System.out.print(i + " ");
    //    }
    //    System.out.println();
    //}
}
