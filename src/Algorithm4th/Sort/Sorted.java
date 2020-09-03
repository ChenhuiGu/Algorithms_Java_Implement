package Algorithm4th.Sort;
import Utils.StdOut;
public class Sorted extends Common{
    //临时数组
    public static void main(String[] args) {
        Integer[] arr = {4,7,12,15,3,8,10};
//        Merge M = new Merge();
//        M.sort(arr);
//        M.sortBU(arr);

        Quick q = new Quick();
        q.sort(arr);
        show(arr);
    }
}
