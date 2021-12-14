package Algorithm4th.stackAndQueue;
import java.util.Arrays;

public class DailyTemperature {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] res = solution.dailyTemperature(temperatures);
        System.out.println("res = " + Arrays.toString(res));
    }

}

class Solution{
    public int[] dailyTemperature(int[] temperatures){
        int length = temperatures.length;
        int[] res = new int[length];
        for (int i = 0; i < length -1; i++) {
            for(int j=i+1;j<length;j++){
                if(temperatures[i] < temperatures[j]){
                    res[i] = j-i;
                    break;
                }
            }
        }
        return res;
    }
}
