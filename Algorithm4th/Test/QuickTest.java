package Algorithm4th.Test;
import Algorithm4th.Sort.Quick;

public class QuickTest {
    public static void main(String[] args) {
        Integer[] arr = {4,7,12,15,3,8,10};
        Quick q = new Quick();
        q.sort(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
