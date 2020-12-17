package Test;
import org.junit.Test;

public class HashCodeTest {
    @Test
    public void hashTest(){
        String key = "化学";
        int h;
        //int k = (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
        int k = (h = key.hashCode()) ^ (h >>> 16);
        System.out.println("h:" + h + ";k:" + k + ";p:" + (k & 16));
    }
}
