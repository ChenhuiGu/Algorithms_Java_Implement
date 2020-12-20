package Algorithm4th.Sort;

import Algorithm4th.utils.Common;

public class Select extends Common {
    public void select(Comparable[] a){
        int N = a.length;
        for(int i=0;i<N;i++){
            int min = i;
            for(int j=i+1;j<N;j++){
                if(less(a,j,min)) min = j;
            }
            System.out.print(min);
            exec(a,i,min);
        }
    }
}
