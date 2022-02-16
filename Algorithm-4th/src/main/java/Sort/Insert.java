package Sort;

import Algorithm4th.utils.Common;

public class Insert extends Common {
    public void  insert(Comparable[] a){
        int N = a.length;
        for(int i=1;i<N;i++){
            for(int j=i;j>0&&less(a,j,j-1);j--){
                exec(a,j,j-1);
                //show(a);
            }
        }
    }
    public void shell(Comparable[] a){
        int N =a.length;
        int h = 1;
        while(h<N/3) h = h*3 + 1;
        while(h>=1){
            for(int i=h;i<N;i++){
                for(int j=i;j>0&&less(a,j,j-h);j-=h){
                    exec(a,j,j-h);
                }
            }
            h = h/3;
        }
    }
}
