package Sort;

/**
 * 分治算法:
 *  每次循环的结果：大于基准值的排在右边，小于基准值的排在左边
 * 循环过程：
 *  随机选定初始值(第一个)X
 *  左指针j从后往前，小于X
 *  右指针i从前往后，大于X
 *  交换i、j元素
 *  当i>=j时退出循环，交换基准元素与j元素
 *  返回j
 * @author chenhuigu
 */
public class Quick extends BaseSort{
    public void sort(int [] a) {
        //乱序，随机交换元素，消除对输入的依赖
        //StdRandom.shuffle(a);
        sort(a, 0, a.length - 1);
    }
    private void sort(int[] a,int lo,int hi){
        if(lo < hi){
            int j = partition(a,lo,hi);
            sort(a,j+1,hi);
            sort(a,lo,j-1);
        }
    }

    private int partition(int[] a,int lo,int hi){
        int i = lo, j = hi;
        while (true){
            if(a[i] < a[lo]){
                i++;
            }
            if(a[j] > a[lo]){
                j--;
            }
            if(i >= j){
                break;
            }
            execBit(a,i,j);
        }
        execBit(a,lo,j);
        return j;
    }






}
